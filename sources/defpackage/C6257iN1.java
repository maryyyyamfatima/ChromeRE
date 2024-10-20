package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6257iN1 extends AbstractC10559uu {
    public static final String w;
    public long e;
    public MediaStatus f;
    public Long g;
    public JM2 h;
    public int i;
    public final C9353rO2 j;
    public final C9353rO2 k;
    public final C9353rO2 l;
    public final C9353rO2 m;
    public final C9353rO2 n;
    public final C9353rO2 o;
    public final C9353rO2 p;
    public final C9353rO2 q;
    public final C9353rO2 r;
    public final C9353rO2 s;
    public final C9353rO2 t;
    public final C9353rO2 u;
    public C6905kF3 v;

    static {
        Pattern pattern = WH.a;
        w = "urn:x-cast:".concat("com.google.cast.media");
    }

    public C6257iN1() {
        super(w);
        this.i = -1;
        C9353rO2 c9353rO2 = new C9353rO2(86400000L);
        this.j = c9353rO2;
        C9353rO2 c9353rO22 = new C9353rO2(86400000L);
        this.k = c9353rO22;
        C9353rO2 c9353rO23 = new C9353rO2(86400000L);
        this.l = c9353rO23;
        C9353rO2 c9353rO24 = new C9353rO2(86400000L);
        C9353rO2 c9353rO25 = new C9353rO2(10000L);
        this.m = c9353rO25;
        C9353rO2 c9353rO26 = new C9353rO2(86400000L);
        this.n = c9353rO26;
        C9353rO2 c9353rO27 = new C9353rO2(86400000L);
        this.o = c9353rO27;
        C9353rO2 c9353rO28 = new C9353rO2(86400000L);
        this.p = c9353rO28;
        C9353rO2 c9353rO29 = new C9353rO2(86400000L);
        C9353rO2 c9353rO210 = new C9353rO2(86400000L);
        C9353rO2 c9353rO211 = new C9353rO2(86400000L);
        C9353rO2 c9353rO212 = new C9353rO2(86400000L);
        this.q = c9353rO212;
        C9353rO2 c9353rO213 = new C9353rO2(86400000L);
        C9353rO2 c9353rO214 = new C9353rO2(86400000L);
        C9353rO2 c9353rO215 = new C9353rO2(86400000L);
        this.r = c9353rO215;
        C9353rO2 c9353rO216 = new C9353rO2(86400000L);
        this.t = c9353rO216;
        this.s = new C9353rO2(86400000L);
        C9353rO2 c9353rO217 = new C9353rO2(86400000L);
        C9353rO2 c9353rO218 = new C9353rO2(86400000L);
        C9353rO2 c9353rO219 = new C9353rO2(86400000L);
        this.u = c9353rO219;
        b(c9353rO2);
        b(c9353rO22);
        b(c9353rO23);
        b(c9353rO24);
        b(c9353rO25);
        b(c9353rO26);
        b(c9353rO27);
        b(c9353rO28);
        b(c9353rO29);
        b(c9353rO210);
        b(c9353rO211);
        b(c9353rO212);
        b(c9353rO213);
        b(c9353rO214);
        b(c9353rO215);
        b(c9353rO216);
        b(c9353rO216);
        b(c9353rO217);
        b(c9353rO218);
        b(c9353rO219);
        e();
    }

    public final long f(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final long h() {
        MediaLiveSeekableRange mediaLiveSeekableRange;
        MediaStatus mediaStatus = this.f;
        MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.a;
        if (mediaInfo == null || mediaStatus == null) {
            return 0L;
        }
        Long l = this.g;
        if (l == null) {
            if (this.e == 0) {
                return 0L;
            }
            double d = mediaStatus.i;
            long j = mediaStatus.l;
            return (d == 0.0d || mediaStatus.j != 2) ? j : f(d, j, mediaInfo.j);
        }
        if (l.equals(4294967296000L)) {
            MediaStatus mediaStatus2 = this.f;
            if (mediaStatus2.z == null) {
                MediaInfo mediaInfo2 = mediaStatus2 == null ? null : mediaStatus2.a;
                if ((mediaInfo2 != null ? mediaInfo2.j : 0L) >= 0) {
                    long longValue = l.longValue();
                    MediaStatus mediaStatus3 = this.f;
                    MediaInfo mediaInfo3 = mediaStatus3 != null ? mediaStatus3.a : null;
                    return Math.min(longValue, mediaInfo3 != null ? mediaInfo3.j : 0L);
                }
            } else {
                long longValue2 = l.longValue();
                MediaStatus mediaStatus4 = this.f;
                if (mediaStatus4 != null && (mediaLiveSeekableRange = mediaStatus4.z) != null) {
                    long j2 = mediaLiveSeekableRange.g;
                    r3 = !mediaLiveSeekableRange.i ? f(1.0d, j2, -1L) : j2;
                }
                return Math.min(longValue2, r3);
            }
        }
        return l.longValue();
    }

    public final void k(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.g(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void s(InterfaceC3857bO2 interfaceC3857bO2, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long a = a();
        try {
            jSONObject2.put("requestId", a);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", i());
            if (i != 0) {
                jSONObject2.put("jump", i);
            }
            String b = AbstractC4194cN1.b(null);
            if (b != null) {
                jSONObject2.put("repeatMode", b);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject2.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        c(a, jSONObject2.toString());
        this.q.d(a, new C5225fN1(this, interfaceC3857bO2));
    }

    public final void p(JSONObject jSONObject) {
        k(jSONObject, "QUEUE_CHANGE");
        if (this.h == null) {
            return;
        }
        String string = jSONObject.getString("changeType");
        int[] j = j(jSONObject.getJSONArray("itemIds"));
        int optInt = jSONObject.optInt("insertBefore", 0);
        if (j == null) {
            return;
        }
        string.getClass();
        char c = 65535;
        switch (string.hashCode()) {
            case -2130463047:
                if (string.equals("INSERT")) {
                    c = 0;
                    break;
                }
                break;
            case -1881281404:
                if (string.equals("REMOVE")) {
                    c = 1;
                    break;
                }
                break;
            case -1785516855:
                if (string.equals("UPDATE")) {
                    c = 2;
                    break;
                }
                break;
            case 1122976047:
                if (string.equals("ITEMS_CHANGE")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Iterator it = this.h.a.i.iterator();
                while (it.hasNext()) {
                    ((AbstractC12087zM2) it.next()).e(j, optInt);
                }
                return;
            case 1:
                Iterator it2 = this.h.a.i.iterator();
                while (it2.hasNext()) {
                    ((AbstractC12087zM2) it2.next()).g(j);
                }
                return;
            case 2:
                int[] j2 = j(jSONObject.getJSONArray("itemIds"));
                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                if (optJSONArray == null) {
                    Iterator it3 = this.h.a.i.iterator();
                    while (it3.hasNext()) {
                        ((AbstractC12087zM2) it3.next()).d(j2);
                    }
                    return;
                } else {
                    ArrayList g = WH.g(j2);
                    int optInt2 = jSONObject.optInt("insertBefore", 0);
                    ArrayList g2 = WH.g(j(optJSONArray));
                    Iterator it4 = this.h.a.i.iterator();
                    while (it4.hasNext()) {
                        ((AbstractC12087zM2) it4.next()).h(g, g2, optInt2);
                    }
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Iterator it5 = this.h.a.i.iterator();
                while (it5.hasNext()) {
                    ((AbstractC12087zM2) it5.next()).i(j);
                }
                return;
            default:
                return;
        }
    }

    public final void q(JSONObject jSONObject) {
        k(jSONObject, "QUEUE_ITEMS");
        if (this.h == null) {
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            mediaQueueItemArr[i] = new AO1(jSONArray.getJSONObject(i)).a();
        }
        Iterator it = this.h.a.i.iterator();
        while (it.hasNext()) {
            ((AbstractC12087zM2) it.next()).f(mediaQueueItemArr);
        }
    }

    public final void r(JSONObject jSONObject) {
        MediaLoadRequestData mediaLoadRequestData;
        JSONObject jSONObject2;
        MediaInfo mediaInfo;
        MediaQueueData mediaQueueData;
        double d;
        String str;
        String str2;
        String str3;
        MediaInfo mediaInfo2;
        double d2;
        MediaQueueData mediaQueueData2;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        long j;
        long[] jArr;
        JSONObject jSONObject3;
        String str7;
        long j2;
        String str8;
        JSONObject jSONObject4;
        long[] jArr2;
        long j3;
        long optLong;
        long[] jArr3;
        JSONObject jSONObject5;
        JSONObject optJSONObject;
        if (this.v == null) {
            return;
        }
        JSONObject optJSONObject2 = jSONObject.has("sessionState") ? jSONObject.optJSONObject("sessionState") : null;
        if (optJSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("loadRequestData");
        if (optJSONObject3 != null) {
            C4856eI1 c4856eI1 = MediaLoadRequestData.s;
            Boolean bool2 = Boolean.TRUE;
            double d3 = 1.0d;
            try {
                mediaInfo = optJSONObject3.has("media") ? new MediaInfo(optJSONObject3.getJSONObject("media")) : null;
            } catch (JSONException unused) {
                jSONObject2 = optJSONObject2;
                mediaInfo = null;
            }
            try {
                if (optJSONObject3.has("queueData")) {
                    C11753yO1 c11753yO1 = new C11753yO1();
                    c11753yO1.a(optJSONObject3.getJSONObject("queueData"));
                    mediaQueueData = new MediaQueueData(c11753yO1.a);
                } else {
                    mediaQueueData = null;
                }
                try {
                    bool2 = optJSONObject3.has("autoplay") ? Boolean.valueOf(optJSONObject3.getBoolean("autoplay")) : null;
                    r14 = optJSONObject3.has("currentTime") ? WH.d(optJSONObject3.getDouble("currentTime")) : -1L;
                    d = optJSONObject3.optDouble("playbackRate", 1.0d);
                } catch (JSONException unused2) {
                    jSONObject2 = optJSONObject2;
                }
            } catch (JSONException unused3) {
                jSONObject2 = optJSONObject2;
                mediaQueueData = null;
                d = d3;
                str = null;
                str2 = null;
                str3 = null;
                mediaInfo2 = mediaInfo;
                d2 = d;
                mediaQueueData2 = mediaQueueData;
                str4 = str;
                bool = bool2;
                str5 = str2;
                str6 = str3;
                j = r14;
                jArr = null;
                jSONObject3 = null;
                str7 = null;
                j2 = 0;
                mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                optJSONObject2 = jSONObject2;
                this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
            }
            if (Double.compare(d, 2.0d) <= 0) {
                if (Double.compare(d, 0.5d) >= 0) {
                    try {
                        str = WH.c(optJSONObject3, "credentials");
                        try {
                            str2 = WH.c(optJSONObject3, "credentialsType");
                        } catch (JSONException unused4) {
                            jSONObject2 = optJSONObject2;
                            str2 = null;
                            str3 = null;
                            mediaInfo2 = mediaInfo;
                            d2 = d;
                            mediaQueueData2 = mediaQueueData;
                            str4 = str;
                            bool = bool2;
                            str5 = str2;
                            str6 = str3;
                            j = r14;
                            jArr = null;
                            jSONObject3 = null;
                            str7 = null;
                            j2 = 0;
                            mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                            optJSONObject2 = jSONObject2;
                            this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                        }
                        try {
                            str3 = WH.c(optJSONObject3, "atvCredentials");
                            try {
                                String c = WH.c(optJSONObject3, "atvCredentialsType");
                                try {
                                    optLong = optJSONObject3.optLong("requestId");
                                    try {
                                        JSONArray optJSONArray = optJSONObject3.optJSONArray("activeTrackIds");
                                        if (optJSONArray != null) {
                                            jArr3 = new long[optJSONArray.length()];
                                            jSONObject2 = optJSONObject2;
                                            str8 = c;
                                            for (int i = 0; i < optJSONArray.length(); i++) {
                                                try {
                                                    jArr3[i] = optJSONArray.getLong(i);
                                                } catch (JSONException unused5) {
                                                    jArr3 = null;
                                                    jSONObject5 = null;
                                                    j3 = optLong;
                                                    JSONObject jSONObject6 = jSONObject5;
                                                    jArr2 = jArr3;
                                                    jSONObject4 = jSONObject6;
                                                    jSONObject3 = jSONObject4;
                                                    mediaInfo2 = mediaInfo;
                                                    d2 = d;
                                                    mediaQueueData2 = mediaQueueData;
                                                    str4 = str;
                                                    bool = bool2;
                                                    str5 = str2;
                                                    str6 = str3;
                                                    j = r14;
                                                    jArr = jArr2;
                                                    j2 = j3;
                                                    str7 = str8;
                                                    mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                                                    optJSONObject2 = jSONObject2;
                                                    this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                                                }
                                            }
                                        } else {
                                            jSONObject2 = optJSONObject2;
                                            str8 = c;
                                            jArr3 = null;
                                        }
                                        try {
                                            optJSONObject = optJSONObject3.optJSONObject("customData");
                                        } catch (JSONException unused6) {
                                            jSONObject5 = null;
                                            j3 = optLong;
                                            JSONObject jSONObject62 = jSONObject5;
                                            jArr2 = jArr3;
                                            jSONObject4 = jSONObject62;
                                            jSONObject3 = jSONObject4;
                                            mediaInfo2 = mediaInfo;
                                            d2 = d;
                                            mediaQueueData2 = mediaQueueData;
                                            str4 = str;
                                            bool = bool2;
                                            str5 = str2;
                                            str6 = str3;
                                            j = r14;
                                            jArr = jArr2;
                                            j2 = j3;
                                            str7 = str8;
                                            mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                                            optJSONObject2 = jSONObject2;
                                            this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                                        }
                                    } catch (JSONException unused7) {
                                        jSONObject2 = optJSONObject2;
                                        str8 = c;
                                    }
                                } catch (JSONException unused8) {
                                    jSONObject2 = optJSONObject2;
                                    str8 = c;
                                    jSONObject4 = null;
                                    jArr2 = null;
                                    j3 = 0;
                                }
                            } catch (JSONException unused9) {
                                jSONObject2 = optJSONObject2;
                                mediaInfo2 = mediaInfo;
                                d2 = d;
                                mediaQueueData2 = mediaQueueData;
                                str4 = str;
                                bool = bool2;
                                str5 = str2;
                                str6 = str3;
                                j = r14;
                                jArr = null;
                                jSONObject3 = null;
                                str7 = null;
                                j2 = 0;
                                mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                                optJSONObject2 = jSONObject2;
                                this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                            }
                        } catch (JSONException unused10) {
                            jSONObject2 = optJSONObject2;
                            str3 = null;
                            mediaInfo2 = mediaInfo;
                            d2 = d;
                            mediaQueueData2 = mediaQueueData;
                            str4 = str;
                            bool = bool2;
                            str5 = str2;
                            str6 = str3;
                            j = r14;
                            jArr = null;
                            jSONObject3 = null;
                            str7 = null;
                            j2 = 0;
                            mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                            optJSONObject2 = jSONObject2;
                            this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                        }
                        try {
                            mediaLoadRequestData = new MediaLoadRequestData(mediaInfo, mediaQueueData, bool2, r14, d, jArr3, optJSONObject, str, str2, str3, str8, optLong);
                        } catch (JSONException unused11) {
                            jSONObject5 = optJSONObject;
                            j3 = optLong;
                            JSONObject jSONObject622 = jSONObject5;
                            jArr2 = jArr3;
                            jSONObject4 = jSONObject622;
                            jSONObject3 = jSONObject4;
                            mediaInfo2 = mediaInfo;
                            d2 = d;
                            mediaQueueData2 = mediaQueueData;
                            str4 = str;
                            bool = bool2;
                            str5 = str2;
                            str6 = str3;
                            j = r14;
                            jArr = jArr2;
                            j2 = j3;
                            str7 = str8;
                            mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                            optJSONObject2 = jSONObject2;
                            this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                        }
                    } catch (JSONException unused12) {
                        jSONObject2 = optJSONObject2;
                        d3 = d;
                        d = d3;
                        str = null;
                        str2 = null;
                        str3 = null;
                        mediaInfo2 = mediaInfo;
                        d2 = d;
                        mediaQueueData2 = mediaQueueData;
                        str4 = str;
                        bool = bool2;
                        str5 = str2;
                        str6 = str3;
                        j = r14;
                        jArr = null;
                        jSONObject3 = null;
                        str7 = null;
                        j2 = 0;
                        mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                        optJSONObject2 = jSONObject2;
                        this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
                    }
                    optJSONObject2 = jSONObject2;
                }
            }
            jSONObject2 = optJSONObject2;
            try {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            } catch (JSONException unused13) {
                d = d3;
                str = null;
                str2 = null;
                str3 = null;
                mediaInfo2 = mediaInfo;
                d2 = d;
                mediaQueueData2 = mediaQueueData;
                str4 = str;
                bool = bool2;
                str5 = str2;
                str6 = str3;
                j = r14;
                jArr = null;
                jSONObject3 = null;
                str7 = null;
                j2 = 0;
                mediaLoadRequestData = new MediaLoadRequestData(mediaInfo2, mediaQueueData2, bool, j, d2, jArr, jSONObject3, str4, str5, str6, str7, j2);
                optJSONObject2 = jSONObject2;
                this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
            }
        }
        mediaLoadRequestData = null;
        this.v.b(new SessionState(mediaLoadRequestData, optJSONObject2.optJSONObject("customData")));
    }

    public static int[] j(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final void g(long j, JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        MediaStatus mediaStatus;
        boolean e = this.j.e(j);
        C9353rO2 c9353rO2 = this.n;
        c9353rO2.getClass();
        Object obj = C9353rO2.g;
        synchronized (obj) {
            i = 1;
            z = c9353rO2.c != -1;
        }
        if (!z || c9353rO2.e(j)) {
            C9353rO2 c9353rO22 = this.o;
            c9353rO22.getClass();
            synchronized (obj) {
                z2 = c9353rO22.c != -1;
            }
            if (!z2 || c9353rO22.e(j)) {
                i = 0;
            }
        }
        if (e || (mediaStatus = this.f) == null) {
            MediaStatus mediaStatus2 = new MediaStatus(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
            mediaStatus2.r1(jSONObject, 0);
            this.f = mediaStatus2;
            this.e = SystemClock.elapsedRealtime();
            i2 = 127;
        } else {
            i2 = mediaStatus.r1(jSONObject, i);
        }
        if ((i2 & 1) != 0) {
            this.e = SystemClock.elapsedRealtime();
            this.i = -1;
            o();
        }
        if ((i2 & 2) != 0) {
            this.e = SystemClock.elapsedRealtime();
            o();
        }
        if ((i2 & 128) != 0) {
            this.e = SystemClock.elapsedRealtime();
        }
        if ((i2 & 4) != 0) {
            l();
        }
        if ((i2 & 8) != 0) {
            n();
        }
        if ((i2 & 16) != 0) {
            m();
        }
        if ((i2 & 32) != 0) {
            this.e = SystemClock.elapsedRealtime();
            JM2 jm2 = this.h;
            if (jm2 != null) {
                KM2 km2 = jm2.a;
                Iterator it = km2.h.iterator();
                if (it.hasNext()) {
                    X5.a(it.next());
                    throw null;
                }
                Iterator it2 = km2.i.iterator();
                while (it2.hasNext()) {
                    ((AbstractC12087zM2) it2.next()).a();
                }
            }
        }
        if ((i2 & 64) != 0) {
            this.e = SystemClock.elapsedRealtime();
            o();
        }
    }

    public final long i() {
        MediaStatus mediaStatus = this.f;
        if (mediaStatus != null) {
            return mediaStatus.g;
        }
        throw new C5569gN1();
    }

    public final void o() {
        JM2 jm2 = this.h;
        if (jm2 != null) {
            KM2 km2 = jm2.a;
            km2.getClass();
            Iterator it = km2.j.values().iterator();
            if (!it.hasNext()) {
                Iterator it2 = km2.h.iterator();
                if (it2.hasNext()) {
                    X5.a(it2.next());
                    throw null;
                }
                Iterator it3 = km2.i.iterator();
                while (it3.hasNext()) {
                    ((AbstractC12087zM2) it3.next()).l();
                }
                return;
            }
            X5.a(it.next());
            if (km2.i()) {
                throw null;
            }
            if (!km2.i()) {
                throw null;
            }
            throw null;
        }
    }

    public final void l() {
        JM2 jm2 = this.h;
        if (jm2 != null) {
            KM2 km2 = jm2.a;
            km2.getClass();
            Iterator it = km2.h.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            Iterator it2 = km2.i.iterator();
            while (it2.hasNext()) {
                ((AbstractC12087zM2) it2.next()).b();
            }
        }
    }

    public final void n() {
        JM2 jm2 = this.h;
        if (jm2 != null) {
            KM2 km2 = jm2.a;
            Iterator it = km2.h.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            Iterator it2 = km2.i.iterator();
            while (it2.hasNext()) {
                ((AbstractC12087zM2) it2.next()).j();
            }
        }
    }

    public final void m() {
        JM2 jm2 = this.h;
        if (jm2 != null) {
            KM2 km2 = jm2.a;
            Iterator it = km2.h.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            Iterator it2 = km2.i.iterator();
            while (it2.hasNext()) {
                ((AbstractC12087zM2) it2.next()).c();
            }
        }
    }

    public final void e() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((C9353rO2) it.next()).a(2002);
        }
    }

    public static C5913hN1 d(JSONObject jSONObject) {
        MediaError.r1(jSONObject);
        C5913hN1 c5913hN1 = new C5913hN1();
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return c5913hN1;
    }
}
