package com.mediaproj.momo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.mediaproj.momo.R
import com.mediaproj.momo.data.MainImgData
import com.mediaproj.momo.data.MainListData
import kotlinx.android.synthetic.main.fragment_main_movie.*
import me.relex.circleindicator.CircleIndicator2


class MovieFragment : Fragment() {

    lateinit var mainRecyclerViewAdapter: MainRecyclerViewAdapter
    lateinit var mainRecommendRecyclerViewAdapter: MainRecommendRecyclerViewAdapter

    private lateinit var rvMainRecommend: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_movie, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//// rv_main_recommend_img 리사이클러뷰 Circle Indicator 설정
//        val pagerSnapHelper = PagerSnapHelper()
//        pagerSnapHelper.attachToRecyclerView(rv_main_recommend_img)
//
//        val rvMainMdReCoIndicator: CircleIndicator2 =
//            rvMainMdReCoIndicator
//        rvMainMdReCoIndicator.attachToRecyclerView(rv_main_recommend_img, pagerSnapHelper)
//
//        // indicator와 리사이클러뷰 연결
//        mainRecommendRecyclerViewAdapter.registerAdapterDataObserver(rvMainMdReCoIndicator.adapterDataObserver)
//
//
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


//        view?.let { view ->
//            rvMainRecommend = view.findViewById(R.id.rv_main_recommend_img)
//            rvMainRecommend.adapter = mainRecommendRecyclerViewAdapter
//
//            // MdRecommmend 리사이클러뷰 Circle Indicator 설정
//            val pagerSnapHelper = PagerSnapHelper()
//            pagerSnapHelper.attachToRecyclerView(rvMainRecommend)
//
//            val rvMainMdReCoIndicator: CircleIndicator2 = view.findViewById(R.id.rvMainMdReCoIndicator)
//            rvMainMdReCoIndicator.attachToRecyclerView(rvMainRecommend, pagerSnapHelper)
//
//            // indicator와 리사이클러뷰 연결
//            mainRecommendRecyclerViewAdapter.registerAdapterDataObserver(rvMainMdReCoIndicator.adapterDataObserver)

            var dataimglist: ArrayList<MainImgData> = ArrayList()


            //movie recommend rv
            dataimglist.add(MainImgData("https://i.ytimg.com/vi/eSEs4B4H-EA/maxresdefault.jpg"))
        dataimglist.add(MainImgData("https://i.ytimg.com/vi/eSEs4B4H-EA/maxresdefault.jpg"))
        dataimglist.add(MainImgData("https://i.ytimg.com/vi/eSEs4B4H-EA/maxresdefault.jpg"))
        dataimglist.add(MainImgData("https://i.ytimg.com/vi/eSEs4B4H-EA/maxresdefault.jpg"))


            //movie bottom rv
//        추후 서버 통신
            var datalist: ArrayList<MainListData> = ArrayList()
            datalist.add(
                MainListData(
                    "https://dimg.donga.com/wps/NEWS/IMAGE/2019/11/15/98372219.2.jpg",
                    "겨울왕국", "30%"
                )
            )
            datalist.add(
                MainListData(
                    "data:image/jpeg;base64,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",
                    "터미네이터", "20%"
                )
            )
            datalist.add(
                MainListData(
                    "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                    "블랙머니", "10%"
                )
            )
            datalist.add(
                MainListData(
                    "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                    "영화4", "5%"
                )
            )
            datalist.add(
                MainListData(
                    "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                    "영화5", "3%"
                )
            )
            datalist.add(
                MainListData(
                    "https://movie.naver.com/movie/bi/mi/basic.nhn?code=167605",
                    "영화6", "2%"
                )
            )

            mainRecyclerViewAdapter = MainRecyclerViewAdapter(context!!, datalist)
            rv_main_movie.adapter = mainRecyclerViewAdapter
            rv_main_movie.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)


            mainRecommendRecyclerViewAdapter =
                MainRecommendRecyclerViewAdapter(context!!, dataimglist)
            rv_main_recommend_img.adapter = mainRecommendRecyclerViewAdapter
            rv_main_recommend_img.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)



        }
    }
