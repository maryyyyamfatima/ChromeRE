package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import defpackage.C11768yR1;
import defpackage.C3856bO1;
import defpackage.C4317ck;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final C4317ck i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public final Bundle a;
    public MediaMetadata g;
    public MediaDescriptionCompat h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        C4317ck c4317ck = new C4317ck();
        i = c4317ck;
        c4317ck.put("android.media.metadata.TITLE", 1);
        c4317ck.put("android.media.metadata.ARTIST", 1);
        c4317ck.put("android.media.metadata.DURATION", 0);
        c4317ck.put("android.media.metadata.ALBUM", 1);
        c4317ck.put("android.media.metadata.AUTHOR", 1);
        c4317ck.put("android.media.metadata.WRITER", 1);
        c4317ck.put("android.media.metadata.COMPOSER", 1);
        c4317ck.put("android.media.metadata.COMPILATION", 1);
        c4317ck.put("android.media.metadata.DATE", 1);
        c4317ck.put("android.media.metadata.YEAR", 0);
        c4317ck.put("android.media.metadata.GENRE", 1);
        c4317ck.put("android.media.metadata.TRACK_NUMBER", 0);
        c4317ck.put("android.media.metadata.NUM_TRACKS", 0);
        c4317ck.put("android.media.metadata.DISC_NUMBER", 0);
        c4317ck.put("android.media.metadata.ALBUM_ARTIST", 1);
        c4317ck.put("android.media.metadata.ART", 2);
        c4317ck.put("android.media.metadata.ART_URI", 1);
        c4317ck.put("android.media.metadata.ALBUM_ART", 2);
        c4317ck.put("android.media.metadata.ALBUM_ART_URI", 1);
        c4317ck.put("android.media.metadata.USER_RATING", 3);
        c4317ck.put("android.media.metadata.RATING", 3);
        c4317ck.put("android.media.metadata.DISPLAY_TITLE", 1);
        c4317ck.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c4317ck.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c4317ck.put("android.media.metadata.DISPLAY_ICON", 2);
        c4317ck.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c4317ck.put("android.media.metadata.MEDIA_ID", 1);
        c4317ck.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c4317ck.put("android.media.metadata.MEDIA_URI", 1);
        c4317ck.put("android.media.metadata.ADVERTISEMENT", 0);
        c4317ck.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        j = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        k = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        l = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C3856bO1();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        C11768yR1.a(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(C11768yR1.class.getClassLoader());
    }

    public final MediaDescriptionCompat c() {
        Bitmap bitmap;
        Uri uri;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.h;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = this.a;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.MEDIA_ID");
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence3)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = j;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i3]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i2] = charSequence4;
                    i2++;
                }
                i3 = i4;
            }
        } else {
            charSequenceArr[0] = charSequence3;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = k;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap2 = (Bitmap) bundle.getParcelable(strArr2[i5]);
            } catch (Exception e) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = l;
            if (i6 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence5 = bundle.getCharSequence(strArr3[i6]);
            String charSequence6 = charSequence5 != null ? charSequence5.toString() : null;
            if (!TextUtils.isEmpty(charSequence6)) {
                uri = Uri.parse(charSequence6);
                break;
            }
            i6++;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.MEDIA_URI");
        String charSequence8 = charSequence7 != null ? charSequence7.toString() : null;
        Uri parse = !TextUtils.isEmpty(charSequence8) ? Uri.parse(charSequence8) : null;
        CharSequence charSequence9 = charSequenceArr[0];
        CharSequence charSequence10 = charSequenceArr[1];
        CharSequence charSequence11 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(charSequence2, charSequence9, charSequence10, charSequence11, bitmap, uri, bundle2.isEmpty() ? null : bundle2, parse);
        this.h = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.a);
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.g = mediaMetadata;
        return mediaMetadataCompat;
    }
}
