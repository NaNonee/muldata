package com.example.demo.utils;
//
//import com.github.pagehelper.ISelect;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.BeanUtils;
//
//public class PageUtil {
//    public static <T>PageData<T> getPageInfo(Integer pageNum, Integer pageSize, ISelect iSelect){
//        PageInfo<Object> pageInfo = PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(iSelect);
//        PageData<T> data = new PageData<>();
//        BeanUtils.copyProperties(pageInfo,data);
//        return data;
//    }
//}
import com.github.pagehelper.PageInfo;
public class PageUtil {
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
