package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3512aO1;
import defpackage.C4856eI1;
import defpackage.C4886eO1;
import defpackage.IR0;
import defpackage.RT2;
import defpackage.WH;
import defpackage.WW1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final C3512aO1 j;
    public final List a;
    public final Bundle g;
    public int h;
    public static final String[] i = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator CREATOR = new C4886eO1();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = RT2.a(20293, parcel);
        RT2.t(parcel, 2, this.a);
        RT2.c(parcel, 3, this.g);
        int i3 = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i3);
        RT2.b(a, parcel);
    }

    static {
        C3512aO1 c3512aO1 = new C3512aO1();
        c3512aO1.b(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        c3512aO1.b(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        c3512aO1.b(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        c3512aO1.b(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        c3512aO1.b(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        c3512aO1.b(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        c3512aO1.b(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        c3512aO1.b(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        c3512aO1.b(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        c3512aO1.b(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        c3512aO1.b(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        j = c3512aO1;
    }

    public MediaMetadata(ArrayList arrayList, Bundle bundle, int i2) {
        this.a = arrayList;
        this.g = bundle;
        this.h = i2;
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i2) {
        this(new ArrayList(), new Bundle(), i2);
    }

    public final void s1(JSONObject jSONObject) {
        Bundle bundle = this.g;
        bundle.clear();
        List list = this.a;
        list.clear();
        this.h = 0;
        try {
            this.h = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            C4856eI1 c4856eI1 = WW1.a;
            try {
                list.clear();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        list.add(new WebImage(optJSONArray.getJSONObject(i2)));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            } catch (JSONException unused3) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i3 = this.h;
        if (i3 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i3 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i3 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C3512aO1 c3512aO1 = j;
                    String str = (String) c3512aO1.b.get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    int a = c3512aO1.a(str);
                                    if (a != 1) {
                                        if (a != 2) {
                                            if (a == 3) {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            } else if (a != 4) {
                                                if (a == 5) {
                                                    long optLong = jSONObject.optLong(next);
                                                    Pattern pattern = WH.a;
                                                    bundle.putLong(str, optLong * 1000);
                                                }
                                            } else if ((obj instanceof String) && WW1.b((String) obj) != null) {
                                                bundle.putString(str, (String) obj);
                                            }
                                        } else if (obj instanceof Integer) {
                                            bundle.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        bundle.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused4) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused5) {
        }
    }

    public final String t1(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int a = j.a(str);
        if (a == 1 || a == 0) {
            return this.g.getString(str);
        }
        throw new IllegalArgumentException(IR0.a("Value for ", str, " must be a ", i[1]));
    }

    public final JSONObject u1() {
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.h);
        } catch (JSONException unused) {
        }
        JSONArray a = WW1.a(this.a);
        if (a != null && a.length() != 0) {
            try {
                jSONObject.put("images", a);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.h;
        if (i2 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i2 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i2 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bundle = this.g;
                if (!hasNext) {
                    break;
                }
                String str = (String) it.next();
                if (str != null && bundle.containsKey(str)) {
                    C3512aO1 c3512aO1 = j;
                    String str2 = (String) c3512aO1.a.get(str);
                    if (str2 != null) {
                        int a2 = c3512aO1.a(str);
                        if (a2 != 1) {
                            if (a2 == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (a2 == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (a2 != 4) {
                                if (a2 == 5) {
                                    jSONObject.put(str2, WH.b(bundle.getLong(str)));
                                }
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj = bundle.get(str3);
                    if (obj instanceof String) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str3, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return r1(this.g, mediaMetadata.g) && this.a.equals(mediaMetadata.a);
    }

    public final int hashCode() {
        int i2 = 17;
        Bundle bundle = this.g;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (i2 * 31);
    }

    public static boolean r1(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !r1((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
