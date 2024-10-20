package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nq1 */
/* loaded from: classes.dex */
public final class C8136nq1 extends AbstractC7856n11 implements InterfaceC6911kH {
    public static final C4856eI1 G = new C4856eI1("CastClient");
    public static final C3588ad H = new C3588ad("Cast.API_CXLESS", new C4698dq1(), AbstractC8480oq1.a);
    public EqualizerSettings A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final YG E;
    public final List F;
    public final BinderC7792mq1 k;
    public HandlerC10413uU3 l;
    public int m;
    public boolean n;
    public boolean o;
    public C6905kF3 p;
    public C6905kF3 q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public ApplicationMetadata u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public final AF3 j() {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Xp1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) ((C9658sH) obj).m());
                c0002Aa1.M0(1, c0002Aa1.a());
                ((C6905kF3) obj2).b(null);
            }
        };
        c5531gF3.d = 8403;
        AF3 b = b(1, c5531gF3.a());
        l();
        new HandlerC10413uU3(this.f);
        e(new YD1(this.k, "castDeviceControllerListenerKey"), 8415);
        return b;
    }

    public C8136nq1(Context context, XG xg) {
        super(context, H, xg, C7512m11.c);
        this.k = new BinderC7792mq1(this);
        this.s = new Object();
        this.t = new Object();
        this.F = Collections.synchronizedList(new ArrayList());
        this.E = xg.c;
        this.B = xg.b;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.m = 1;
        i();
    }

    public final boolean k() {
        return this.m == 2;
    }

    public final AF3 n(final String str, final String str2) {
        WH.e(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() <= 524288) {
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.a = new InterfaceC5565gM2() { // from class: Rp1
                public final /* synthetic */ String b = null;

                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C9658sH c9658sH = (C9658sH) obj;
                    C6905kF3 c6905kF3 = (C6905kF3) obj2;
                    C8136nq1 c8136nq1 = C8136nq1.this;
                    HashMap hashMap = c8136nq1.C;
                    long incrementAndGet = c8136nq1.r.incrementAndGet();
                    try {
                        hashMap.put(Long.valueOf(incrementAndGet), c6905kF3);
                        String str3 = this.b;
                        String str4 = str;
                        String str5 = str2;
                        if (str3 == null) {
                            C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) c9658sH.m());
                            Parcel a = c0002Aa1.a();
                            a.writeString(str4);
                            a.writeString(str5);
                            a.writeLong(incrementAndGet);
                            c0002Aa1.M0(9, a);
                        } else {
                            C0002Aa1 c0002Aa12 = (C0002Aa1) ((InterfaceC0262Ca1) c9658sH.m());
                            Parcel a2 = c0002Aa12.a();
                            a2.writeString(str4);
                            a2.writeString(str5);
                            a2.writeLong(incrementAndGet);
                            a2.writeString(str3);
                            c0002Aa12.M0(15, a2);
                        }
                    } catch (RemoteException e) {
                        hashMap.remove(Long.valueOf(incrementAndGet));
                        c6905kF3.a(e);
                    }
                }
            };
            c5531gF3.d = 8405;
            return b(1, c5531gF3.a());
        }
        G.g("Message send failed. Message exceeds maximum size", new Object[0]);
        throw new IllegalArgumentException("Message exceeds maximum size524288");
    }

    public final AF3 o(final String str, final ZG zg) {
        WH.e(str);
        if (zg != null) {
            synchronized (this.D) {
                this.D.put(str, zg);
            }
        }
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: bq1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C9658sH c9658sH = (C9658sH) obj;
                C6905kF3 c6905kF3 = (C6905kF3) obj2;
                this.getClass();
                C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) c9658sH.m());
                Parcel a = c0002Aa1.a();
                String str2 = str;
                a.writeString(str2);
                c0002Aa1.M0(12, a);
                if (zg != null) {
                    C0002Aa1 c0002Aa12 = (C0002Aa1) ((InterfaceC0262Ca1) c9658sH.m());
                    Parcel a2 = c0002Aa12.a();
                    a2.writeString(str2);
                    c0002Aa12.M0(11, a2);
                }
                c6905kF3.b(null);
            }
        };
        c5531gF3.d = 8413;
        return b(1, c5531gF3.a());
    }

    public final AF3 m(final String str) {
        final ZG zg;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.D) {
            zg = (ZG) this.D.remove(str);
        }
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: aq1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C9658sH c9658sH = (C9658sH) obj;
                C6905kF3 c6905kF3 = (C6905kF3) obj2;
                this.getClass();
                if (zg != null) {
                    C0002Aa1 c0002Aa1 = (C0002Aa1) ((InterfaceC0262Ca1) c9658sH.m());
                    Parcel a = c0002Aa1.a();
                    a.writeString(str);
                    c0002Aa1.M0(12, a);
                }
                c6905kF3.b(null);
            }
        };
        c5531gF3.d = 8414;
        return b(1, c5531gF3.a());
    }

    public final void l() {
        G.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public static void h(C8136nq1 c8136nq1, int i) {
        synchronized (c8136nq1.t) {
            C6905kF3 c6905kF3 = c8136nq1.q;
            if (c6905kF3 == null) {
                return;
            }
            if (i == 0) {
                c6905kF3.b(new Status(i, null, 0));
            } else {
                c6905kF3.a(AbstractC10800vd.a(new Status(i, null)));
            }
            c8136nq1.q = null;
        }
    }

    public static void g(C8136nq1 c8136nq1, long j, int i) {
        C6905kF3 c6905kF3;
        synchronized (c8136nq1.C) {
            c6905kF3 = (C6905kF3) c8136nq1.C.get(Long.valueOf(j));
            c8136nq1.C.remove(Long.valueOf(j));
        }
        if (c6905kF3 != null) {
            if (i == 0) {
                c6905kF3.b(null);
            } else {
                c6905kF3.a(AbstractC10800vd.a(new Status(i, null)));
            }
        }
    }

    public static HandlerC10413uU3 f(C8136nq1 c8136nq1) {
        if (c8136nq1.l == null) {
            c8136nq1.l = new HandlerC10413uU3(c8136nq1.f);
        }
        return c8136nq1.l;
    }

    public final void i() {
        CastDevice castDevice = this.B;
        if (castDevice.u1(2048) || !castDevice.u1(4) || castDevice.u1(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.j);
    }
}
