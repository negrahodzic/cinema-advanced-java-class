/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.model;

import java.io.Serializable;

/**
 *
 * @author Negra
 */
public class ReviewDto implements Serializable {

    private Long reviewId;
    private String comment;

    public ReviewDto() {
    }

    public ReviewDto(Long reviewId, String comment) {
        this.reviewId = reviewId;
        this.comment = comment;
    }
}
