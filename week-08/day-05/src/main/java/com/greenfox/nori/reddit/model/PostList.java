package com.greenfox.nori.reddit.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 12..
 */
@Getter
@Setter

public class PostList {

    private Iterable<Post> posts;
}
