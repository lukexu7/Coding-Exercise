package com.atguigu02.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/20 - 16:14
 * @Version: v1.0
 */


public class DAO<T> {


    Map<String,T> map;

    {
        map = new HashMap<>();
    }



    public void save(String id, T entity){
        map.put(id,entity);
    }


    public T get(String id){
        return map.get(id);
    }


    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);

        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
