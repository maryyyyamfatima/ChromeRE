package defpackage;

import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KM2 implements ZG {
    public static final C4856eI1 k = new C4856eI1("RemoteMediaClient");
    public final Object a;
    public final HandlerC10413uU3 b;
    public final C6257iN1 c;
    public final BM2 d;
    public final C11067wO1 e;
    public InterfaceC6911kH f;
    public C6905kF3 g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap j;

    static {
        String str = C6257iN1.w;
    }

    public KM2(C6257iN1 c6257iN1) {
        new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new HandlerC10413uU3(Looper.getMainLooper());
        BM2 bm2 = new BM2(this);
        this.d = bm2;
        this.c = c6257iN1;
        c6257iN1.h = new JM2(this);
        c6257iN1.c = bm2;
        this.e = new C11067wO1(this);
    }

    public final void o(C8136nq1 c8136nq1) {
        InterfaceC6911kH interfaceC6911kH = this.f;
        if (interfaceC6911kH == c8136nq1) {
            return;
        }
        BM2 bm2 = this.d;
        if (interfaceC6911kH != null) {
            C6257iN1 c6257iN1 = this.c;
            synchronized (c6257iN1.d) {
                Iterator it = c6257iN1.d.iterator();
                while (it.hasNext()) {
                    ((C9353rO2) it.next()).a(2002);
                }
            }
            c6257iN1.e();
            this.e.c();
            ((C8136nq1) interfaceC6911kH).m(c6257iN1.b);
            bm2.a = null;
            this.b.removeCallbacksAndMessages(null);
        }
        this.f = c8136nq1;
        if (c8136nq1 != null) {
            bm2.a = c8136nq1;
        }
    }

    public final BasePendingResult m() {
        if (!h()) {
            return f();
        }
        C10372uM2 c10372uM2 = new C10372uM2(this);
        b(c10372uM2);
        return c10372uM2;
    }

    public final BasePendingResult n() {
        if (!h()) {
            return f();
        }
        C10715vM2 c10715vM2 = new C10715vM2(this);
        b(c10715vM2);
        return c10715vM2;
    }

    public final void p() {
        if (this.g == null) {
            return;
        }
        k.a("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
        MediaInfo d = d();
        MediaStatus e = e();
        SessionState sessionState = null;
        if (d != null && e != null) {
            Boolean bool = Boolean.TRUE;
            long c = c();
            MediaQueueData mediaQueueData = e.A;
            double d2 = e.i;
            if (Double.compare(d2, 2.0d) <= 0 && Double.compare(d2, 0.5d) >= 0) {
                sessionState = new SessionState(new MediaLoadRequestData(d, mediaQueueData, bool, c, d2, e.p, e.t, null, null, null, null, 0L), null);
            } else {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
        }
        if (sessionState != null) {
            this.g.b(sessionState);
        } else {
            this.g.a(new C5569gN1());
        }
    }

    public final long c() {
        long h;
        synchronized (this.a) {
            h = this.c.h();
        }
        return h;
    }

    public final long g() {
        long j;
        synchronized (this.a) {
            try {
                MediaStatus mediaStatus = this.c.f;
                MediaInfo mediaInfo = mediaStatus == null ? null : mediaStatus.a;
                j = mediaInfo != null ? mediaInfo.j : 0L;
            } finally {
            }
        }
        return j;
    }

    public final MediaStatus e() {
        MediaStatus mediaStatus;
        synchronized (this.a) {
            mediaStatus = this.c.f;
        }
        return mediaStatus;
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            MediaStatus mediaStatus = this.c.f;
            mediaInfo = mediaStatus == null ? null : mediaStatus.a;
        }
        return mediaInfo;
    }

    public final void q() {
        int i;
        synchronized (this.a) {
            MediaStatus e = e();
            i = e != null ? e.j : 1;
        }
        if (i == 4 || i == 2) {
            m();
        } else {
            n();
        }
    }

    public final boolean l() {
        MediaStatus e = e();
        return e != null && e.j == 2;
    }

    public final boolean k() {
        int i;
        MediaStatus e = e();
        if (e == null) {
            return false;
        }
        if (e.j != 3) {
            MediaInfo d = d();
            if (!(d != null && d.g == 2)) {
                return false;
            }
            synchronized (this.a) {
                MediaStatus e2 = e();
                i = e2 != null ? e2.k : 0;
            }
            if (i != 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean i() {
        MediaStatus e = e();
        if (e != null && e.j == 4) {
            return true;
        }
        MediaStatus e2 = e();
        return (e2 != null && e2.j == 5) || l() || k() || j();
    }

    public final boolean j() {
        MediaStatus e = e();
        return (e == null || e.q == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ZG
    public final void a(CastDevice castDevice, String str, String str2) {
        char c;
        int[] j;
        C6257iN1 c6257iN1 = this.c;
        c6257iN1.getClass();
        C4856eI1 c4856eI1 = c6257iN1.a;
        c4856eI1.a("message received: %s", str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -61993624:
                    if (string.equals("SESSION_STATE")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            C9353rO2 c9353rO2 = c6257iN1.j;
            List list = c6257iN1.d;
            switch (c) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        c6257iN1.g(optLong, jSONArray.getJSONObject(0));
                    } else {
                        c6257iN1.f = null;
                        c6257iN1.o();
                        c6257iN1.l();
                        c6257iN1.n();
                        c6257iN1.m();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C9353rO2) it.next()).b(optLong, 0, null);
                    }
                    return;
                case 1:
                    c4856eI1.g("received unexpected error: Invalid Player State.", new Object[0]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((C9353rO2) it2.next()).b(optLong, 2100, C6257iN1.d(jSONObject));
                    }
                    return;
                case 2:
                    c9353rO2.b(optLong, 2100, C6257iN1.d(jSONObject));
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    c9353rO2.b(optLong, 2101, C6257iN1.d(jSONObject));
                    return;
                case 4:
                    c4856eI1.g("received unexpected error: Invalid Request.", new Object[0]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((C9353rO2) it3.next()).b(optLong, 2001, C6257iN1.d(jSONObject));
                    }
                    return;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((C9353rO2) it4.next()).b(optLong, 2100, C6257iN1.d(jSONObject));
                    }
                    if (c6257iN1.h == null) {
                        return;
                    }
                    MediaError.r1(jSONObject);
                    Iterator it5 = c6257iN1.h.a.i.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC12087zM2) it5.next()).getClass();
                    }
                    return;
                case 6:
                    c6257iN1.r.b(optLong, 0, null);
                    c6257iN1.k(jSONObject, "QUEUE_ITEM_IDS");
                    if (c6257iN1.h != null && (j = C6257iN1.j(jSONObject.getJSONArray("itemIds"))) != null) {
                        Iterator it6 = c6257iN1.h.a.i.iterator();
                        while (it6.hasNext()) {
                            ((AbstractC12087zM2) it6.next()).d(j);
                        }
                        return;
                    }
                    return;
                case 7:
                    c6257iN1.t.b(optLong, 0, null);
                    c6257iN1.p(jSONObject);
                    return;
                case '\b':
                    c6257iN1.s.b(optLong, 0, null);
                    c6257iN1.q(jSONObject);
                    return;
                case '\t':
                    c6257iN1.u.b(optLong, 0, null);
                    c6257iN1.r(jSONObject);
                    return;
                default:
                    return;
            }
        } catch (JSONException e) {
            c4856eI1.g("Message is malformed (%s); ignoring: %s", e.getMessage(), str2);
        }
    }

    public final boolean h() {
        return this.f != null;
    }

    public static DM2 f() {
        DM2 dm2 = new DM2();
        dm2.a(new CM2(new Status(17, null, 0)));
        return dm2;
    }

    public static void b(GM2 gm2) {
        try {
            gm2.m();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            gm2.a(new FM2(new Status(2100, null, 0)));
        }
    }
}
