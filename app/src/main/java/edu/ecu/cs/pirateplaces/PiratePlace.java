package edu.ecu.cs.pirateplaces;

import java.io.Serializable;
import java.util.Date;

/**
 * Represents a specific Pirate Place
 *
 * @author Mark Hills (mhills@cs.ecu.edu)
 * @version 1.0
 */

public class PiratePlace implements Serializable
{
    /** The name of the place */
    private String mPlaceName;

    /** The date the place was last visited */
    private Date mLastVisited;

    /**
     * Create a Pirate Place item
     *
     * @param placeName The name of the place
     * @param lastVisited The date the place was last visited
     */
    public PiratePlace(String placeName, Date lastVisited)
    {
        mPlaceName = placeName;
        mLastVisited = lastVisited;
    }

    /**
     * Get the place name
     *
     * @return the place name
     */
    public String getPlaceName()
    {
        return mPlaceName;
    }

    /**
     * Set the place name
     *
     * @param placeName The new place name
     */
    public void setPlaceName(String placeName)
    {
        mPlaceName = placeName;
    }

    /**
     * Get the last visited date
     *
     * @return the last visisted date
     */
    public Date getLastVisited()
    {
        return mLastVisited;
    }

    /**
     * Set the last visited date
     *
     * @param lastVisited The new lastVisisted date
     */
    public void setLastVisited(Date lastVisited)
    {
        mLastVisited = lastVisited;
    }
}