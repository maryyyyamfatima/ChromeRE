package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.C3822bH2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3822bH2();
    public final int a;
    public final float g;
    public Object h;

    public RatingCompat(int i, float f) {
        this.a = i;
        this.g = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.g;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.g);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0015. Please report as an issue. */
    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    case 4:
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    case 6:
                        ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = new RatingCompat(1, rating.hasHeart() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    case 4:
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle != 5) {
                            Log.e("Rating", "Invalid rating style (" + ratingStyle + ") for a star rating");
                            break;
                        } else {
                            f = 5.0f;
                        }
                        if (starRating < 0.0f || starRating > f) {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        } else {
                            ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                            break;
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating < 0.0f || percentRating > 100.0f) {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        } else {
                            ratingCompat2 = new RatingCompat(6, percentRating);
                            break;
                        }
                    default:
                        return null;
                }
            }
            ratingCompat2.h = obj;
        }
        return ratingCompat2;
    }
}
