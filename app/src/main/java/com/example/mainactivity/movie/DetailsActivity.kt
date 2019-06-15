package com.example.mainactivity.movie

import android.annotation.SuppressLint
import android.content.ClipData
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.bumptech.glide.Glide
import com.example.mainactivity.R
import kotlinx.android.synthetic.main.activity_details.*



import android.content.res.Resources
import android.webkit.WebView
import android.widget.Toast


class DetailsActivity : AppCompatActivity() {
    //val mWebview: WebView? = null
    var link = ""// global variable
    var res: Resources? = null// global variable

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_details)
        //toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar!!.title = "Details"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val data = intent.extras
        if (data != null) {
            val movie = data.getParcelable(MOVIE_MODEL_KEY) as MovieModel
            Glide.with(this)
                .load(movie.image_url)
                .centerCrop()
                .into(img_movie)
            tv_title.text = movie.title
        }


//        val mWebview: WebView = findViewById(R.id.help_webview)
//        val webSettings = mWebview.getSettings()
//        webSettings.setJavaScriptEnabled(true)
//        webSettings.setUseWideViewPort(true)
//        webSettings.setLoadWithOverviewMode(true)
        tv_overview.text = "2 jalapeno peppers, cut in half lengthwise and seeded\n" +
                "2 slices sour dough bread\n" +
                "1 tablespoon butter, room temperature\n" +
                "2 tablespoons cream cheese, room temperature\n" +
                "1/2 cup jack and cheddar cheese, shredded\n" +
                "1 tablespoon tortilla chips, crumbled"




            //getData()
    }

//    private fun getData() {
//        val data = intent.extras
//        val movie = data.getParcelable<MovieModel>(MOVIE_MODEL_KEY)
//
//        if (data != null) {
//            //tv_title.text = movie.title
//            //tv_overview.text = movie.overview
//            //tv_release_date.text = "Release date: " + movie.release_date
//
//            Glide.with(this)
//            .load("https://www.food2fork.com/api/search?key=98588d926fccf774934596f1fbef36b9&q=shredded%20chicken" + movie.image_url)
//            .centerCrop()
//            .override(800,1000)
//            .into(img_movie)
//
////            rating_bar.rating = movie.vote_average/2
////            if (movie.video)
////                img_play.visibility = View.VISIBLE
////            else
////                img_play.visibility = View.INVISIBLE
//        }
//    }
}
