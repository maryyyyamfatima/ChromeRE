package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.android.chrome.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kO1 */
/* loaded from: classes2.dex */
public final class C6948kO1 {
    public Service a;
    public final InterfaceC5574gO1 b;
    public final SparseArray c;
    public PO d;
    public Bitmap e;
    public C7980nO1 f;
    public C11768yR1 g;
    public final C6604jO1 h;
    public final C5230fO1 i = new C5230fO1(this);

    public final void b() {
        C6604jO1 c6604jO1 = this.h;
        c6604jO1.b.removeCallbacks(c6604jO1.c);
        c6604jO1.d = null;
        c6604jO1.c = null;
        if (this.f == null) {
            return;
        }
        new C6861k72(V60.a).b(this.f.k, null);
        C11768yR1 c11768yR1 = this.g;
        if (c11768yR1 != null) {
            c11768yR1.d(null, null);
            this.g.c(false);
            C9710sR1 c9710sR1 = this.g.a;
            c9710sR1.e = true;
            c9710sR1.f.kill();
            int i = Build.VERSION.SDK_INT;
            MediaSession mediaSession = c9710sR1.a;
            if (i == 27) {
                try {
                    Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(mediaSession);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            mediaSession.setCallback(null);
            mediaSession.release();
            this.g = null;
        }
        f();
        this.f = null;
        this.d = null;
    }

    public static boolean c(Service service, W72 w72) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return false;
        }
        int i2 = w72.b.c;
        Notification notification = w72.a;
        if (notification == null) {
            return true;
        }
        if (i >= 31) {
            AbstractC0410De.a(service, i2, notification);
            return true;
        }
        if (i < 29) {
            service.startForeground(i2, notification);
            return true;
        }
        service.startForeground(i2, notification, 0);
        return true;
    }

    public C6948kO1(InterfaceC5574gO1 interfaceC5574gO1) {
        this.b = interfaceC5574gO1;
        SparseArray sparseArray = new SparseArray();
        this.c = sparseArray;
        sparseArray.put(0, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f0902ff, "org.chromium.components.browser_ui.media.ACTION_PLAY", R.string.0_resource_name_obfuscated_res_0x7f140159, 17));
        sparseArray.put(1, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f0902f6, "org.chromium.components.browser_ui.media.ACTION_PAUSE", R.string.0_resource_name_obfuscated_res_0x7f140157, 18));
        sparseArray.put(7, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f090322, "org.chromium.components.browser_ui.media.ACTION_STOP", R.string.0_resource_name_obfuscated_res_0x7f140163, 19));
        sparseArray.put(2, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f090320, "org.chromium.components.browser_ui.media.ACTION_PREVIOUS_TRACK", R.string.0_resource_name_obfuscated_res_0x7f14015c, 20));
        sparseArray.put(3, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f09031f, "org.chromium.components.browser_ui.media.ACTION_NEXT_TRACK", R.string.0_resource_name_obfuscated_res_0x7f140146, 21));
        sparseArray.put(5, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f090206, "org.chromium.components.browser_ui.media.ACTION_SEEK_FORWARD", R.string.0_resource_name_obfuscated_res_0x7f140162, 22));
        sparseArray.put(4, new C5918hO1(R.drawable.0_resource_name_obfuscated_res_0x7f090207, "MediaNotificationmanager.ListenerService.SEEK_BACKWARD", R.string.0_resource_name_obfuscated_res_0x7f140161, 23));
        this.h = new C6604jO1(this);
    }

    public final void d(int i) {
        C7980nO1 c7980nO1 = this.f;
        if (c7980nO1 == null) {
            return;
        }
        c7980nO1.m.b(i);
    }

    public static boolean e(C7980nO1 c7980nO1, C7980nO1 c7980nO12) {
        Set set = c7980nO12.n;
        if ((set == null || !set.isEmpty()) && !c7980nO12.equals(c7980nO1)) {
            return (!c7980nO12.c || c7980nO1 == null || c7980nO12.e == c7980nO1.e) ? false : true;
        }
        return true;
    }

    public final void f() {
        Service service = this.a;
        if (service == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                service.stopForeground(true & true);
            } else {
                service.stopForeground(1);
            }
        } catch (NullPointerException e) {
            AbstractC4851eH1.a("ForegroundService", "Failed to stop foreground service, ", e);
        }
        this.a.stopSelf();
    }

    public final void h(boolean z, boolean z2) {
        Service service = this.a;
        if (service == null) {
            return;
        }
        C7980nO1 c7980nO1 = this.f;
        InterfaceC5574gO1 interfaceC5574gO1 = this.b;
        if (c7980nO1 == null) {
            if (z) {
                c(service, X72.a("media", new C7893n72(6, null, ((C11408xO) interfaceC5574gO1).a)).d());
                Service service2 = this.a;
                try {
                    if (Build.VERSION.SDK_INT < 24) {
                        service2.stopForeground(true);
                    } else {
                        service2.stopForeground(1);
                    }
                    return;
                } catch (NullPointerException e) {
                    AbstractC4851eH1.a("ForegroundService", "Failed to stop foreground service, ", e);
                    return;
                }
            }
            return;
        }
        g();
        i();
        W72 d = this.d.d();
        boolean z3 = z && c(this.a, d);
        C7980nO1 c7980nO12 = this.f;
        boolean z4 = (c7980nO12.a & 4) != 0;
        C7893n72 c7893n72 = d.b;
        Notification notification = d.a;
        if (z4 && c7980nO12.c) {
            Service service3 = this.a;
            try {
                if (Build.VERSION.SDK_INT < 24) {
                    service3.stopForeground(false);
                } else {
                    service3.stopForeground(2);
                }
            } catch (NullPointerException e2) {
                AbstractC4851eH1.a("ForegroundService", "Failed to stop foreground service, ", e2);
            }
            C6861k72 c6861k72 = new C6861k72(V60.a);
            if (notification == null) {
                AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
            } else {
                c6861k72.c(c7893n72.b, c7893n72.c, notification);
            }
        } else if (!z3) {
            try {
                Service service4 = this.a;
                int i = c7980nO12.k;
                if (notification != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        AbstractC0410De.a(service4, i, notification);
                    } else if (i2 < 29) {
                        service4.startForeground(i, notification);
                    } else {
                        service4.startForeground(i, notification, 0);
                    }
                }
            } catch (RuntimeException unused) {
                C6861k72 c6861k722 = new C6861k72(V60.a);
                if (notification == null) {
                    AbstractC4851eH1.a("NotifManagerProxy", "Failed to create notification.", new Object[0]);
                } else {
                    c6861k722.c(c7893n72.b, c7893n72.c, notification);
                }
            }
        }
        if (z2) {
            ((C11408xO) interfaceC5574gO1).getClass();
            U72.a.b(6, notification);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [K62] */
    /* JADX WARN: Type inference failed for: r3v1, types: [PO] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final void i() {
        int[] b;
        InterfaceC5574gO1 interfaceC5574gO1 = this.b;
        C11408xO c11408xO = (C11408xO) interfaceC5574gO1;
        ?? a = X72.a("media", new C7893n72(6, null, c11408xO.a));
        this.d = a;
        C7980nO1 c7980nO1 = this.f;
        boolean z = c7980nO1.f;
        ?? r10 = a.a;
        if (!z) {
            a.h(c7980nO1.b.a);
            MediaMetadata mediaMetadata = this.f.b;
            String str = mediaMetadata.b;
            if (str == null) {
                str = "";
            }
            String str2 = mediaMetadata.c;
            String str3 = str2 != null ? str2 : "";
            String concat = (str.isEmpty() || str3.isEmpty()) ? str.concat(str3) : AbstractC8192o0.a(str, " - ", str3);
            if ((Build.VERSION.SDK_INT >= 24) == true || !concat.isEmpty()) {
                a.g(concat);
                a.n(this.f.d);
            } else {
                a.g(this.f.d);
            }
        } else if ((Build.VERSION.SDK_INT >= 24) == true) {
            a.h(V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140615));
            a.n(V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406f0));
        } else {
            c11408xO.getClass();
            r10.f(V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5));
            a.g(V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140615));
        }
        C7980nO1 c7980nO12 = this.f;
        if (((c7980nO12.a & 1) != 0) == true) {
            Bitmap bitmap = c7980nO12.h;
            if (bitmap != null && !c7980nO12.f) {
                a.j(bitmap);
            } else if ((Build.VERSION.SDK_INT >= 24) == false) {
                if (this.e == null && c7980nO12.i != 0) {
                    this.e = AbstractC7292lO1.a(BitmapFactory.decodeResource(V60.a.getResources(), this.f.i));
                }
                a.j(this.e);
            }
        } else {
            a.j(null);
        }
        HashSet hashSet = new HashSet();
        if (((this.f.a & 1) != 0) != false) {
            Set set = this.f.n;
            if (set != null) {
                hashSet.addAll(set);
            }
            if (this.f.c) {
                hashSet.remove(1);
                hashSet.add(0);
            } else {
                hashSet.remove(0);
                hashSet.add(1);
            }
        }
        if ((this.f.a & 2) != 0) {
            hashSet.add(7);
        } else {
            hashSet.remove(7);
        }
        int[] iArr = {2, 4, 0, 1, 5, 3, 7};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            int i3 = iArr[i];
            if (hashSet.contains(Integer.valueOf(i3))) {
                arrayList.add(Integer.valueOf(i3));
            }
            if (arrayList.size() == 5) {
                break;
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5918hO1 c5918hO1 = (C5918hO1) this.c.get(((Integer) it.next()).intValue());
            int i4 = c5918hO1.a;
            String string = V60.a.getResources().getString(c5918hO1.b);
            Class cls = ((C10036tO) C11408xO.b.get(((C11408xO) interfaceC5574gO1).a)).a;
            a.a(i4, string, C4705dr2.c(V60.a, 0, (cls != null ? new Intent(V60.a, (Class<?>) cls) : null).setAction(c5918hO1.c), AbstractC2281Ro1.d(false) | 268435456), c5918hO1.d);
        }
        if ((this.f.a & 1) != 0) {
            C11768yR1 c11768yR1 = this.g;
            if (arrayList.size() <= 3) {
                b = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    b[i5] = i5;
                }
            } else if (arrayList.contains(2) && arrayList.contains(3)) {
                int[] iArr2 = new int[3];
                iArr2[0] = arrayList.indexOf(2);
                if (arrayList.contains(0)) {
                    iArr2[1] = arrayList.indexOf(0);
                } else {
                    iArr2[1] = arrayList.indexOf(1);
                }
                iArr2[2] = arrayList.indexOf(3);
                b = iArr2;
            } else if (arrayList.contains(4) && arrayList.contains(5)) {
                b = new int[3];
                b[0] = arrayList.indexOf(4);
                if (arrayList.contains(0)) {
                    b[1] = arrayList.indexOf(0);
                } else {
                    b[1] = arrayList.indexOf(1);
                }
                b[2] = arrayList.indexOf(5);
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.contains(1)) {
                    arrayList2.add(Integer.valueOf(arrayList.indexOf(1)));
                } else {
                    arrayList2.add(Integer.valueOf(arrayList.indexOf(0)));
                    if (arrayList.contains(7)) {
                        arrayList2.add(Integer.valueOf(arrayList.indexOf(7)));
                    }
                }
                b = AbstractC9048qW.b(arrayList2);
            }
            L62 l62 = new L62();
            l62.e = c11768yR1.a.b;
            l62.d = b;
            r10.k(l62);
        }
        PO po = this.d;
        K62 k62 = po.a;
        k62.l = false;
        k62.E.when = 0L;
        po.l(this.f.g);
        this.d.a.d(false);
        PO po2 = this.d;
        po2.a.t = true;
        SparseArray sparseArray = C11408xO.b;
        po2.a.r = ((C10036tO) sparseArray.get(c11408xO.a)).b;
        PO po3 = this.d;
        po3.a.s = true;
        if ((4 & this.f.a) != 0) {
            po3.k(!r3.c);
            PO po4 = this.d;
            Class cls2 = ((C10036tO) sparseArray.get(((C11408xO) interfaceC5574gO1).a)).a;
            po4.i(C4705dr2.c(V60.a, 0, (cls2 != null ? new Intent(V60.a, (Class<?>) cls2) : null).setAction("org.chromium.components.browser_ui.media.ACTION_SWIPE"), AbstractC2281Ro1.d(false) | 268435456));
        }
        C7980nO1 c7980nO13 = this.f;
        Intent intent = c7980nO13.l;
        if (intent != null) {
            this.d.f(C4705dr2.a(V60.a, c7980nO13.e, intent, 134217728 | AbstractC2281Ro1.d(false)));
        }
        this.d.a.x = !this.f.f ? 1 : 0;
    }

    public final void g() {
        MediaMetadataCompat mediaMetadataCompat;
        float f;
        long elapsedRealtime;
        long j;
        if ((this.f.a & 1) != 0) {
            C11768yR1 c11768yR1 = this.g;
            InterfaceC5574gO1 interfaceC5574gO1 = this.b;
            if (c11768yR1 == null) {
                Context context = V60.a;
                ((C11408xO) interfaceC5574gO1).getClass();
                C11768yR1 c11768yR12 = new C11768yR1(context, V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5));
                c11768yR12.d(this.i, null);
                c11768yR12.c(true);
                this.g = c11768yR12;
            }
            a(this.f.e);
            C11768yR1 c11768yR13 = this.g;
            ((C11408xO) interfaceC5574gO1).getClass();
            MQ1.d(V60.a);
            MQ1.l(c11768yR13);
            C11768yR1 c11768yR14 = this.g;
            C4543dO1 c4543dO1 = new C4543dO1();
            C7980nO1 c7980nO1 = this.f;
            boolean z = c7980nO1.f;
            Bundle bundle = c4543dO1.a;
            if (!z) {
                c4543dO1.c("android.media.metadata.TITLE", c7980nO1.b.a);
                c4543dO1.c("android.media.metadata.ARTIST", this.f.d);
                if (!TextUtils.isEmpty(this.f.b.b)) {
                    c4543dO1.c("android.media.metadata.ARTIST", this.f.b.b);
                }
                if (!TextUtils.isEmpty(this.f.b.c)) {
                    c4543dO1.c("android.media.metadata.ALBUM", this.f.b.c);
                }
                Bitmap bitmap = this.f.j;
                if (bitmap != null) {
                    c4543dO1.a(bitmap, "android.media.metadata.ALBUM_ART");
                }
                MediaPosition mediaPosition = this.f.o;
                if (mediaPosition != null) {
                    c4543dO1.b(mediaPosition.a());
                }
                mediaMetadataCompat = new MediaMetadataCompat(bundle);
            } else {
                mediaMetadataCompat = new MediaMetadataCompat(bundle);
            }
            c11768yR14.e(mediaMetadataCompat);
            C11768yR1 c11768yR15 = this.g;
            ArrayList arrayList = new ArrayList();
            Set set = this.f.n;
            if (set != null) {
                r5 = set.contains(2) ? 22L : 6L;
                if (set.contains(3)) {
                    r5 |= 32;
                }
                if (set.contains(5)) {
                    r5 |= 64;
                }
                if (set.contains(4)) {
                    r5 |= 8;
                }
                if (set.contains(8)) {
                    r5 |= 256;
                }
            }
            long j2 = r5;
            C7980nO1 c7980nO12 = this.f;
            int i = c7980nO12.c ? 2 : 3;
            MediaPosition mediaPosition2 = c7980nO12.o;
            if (mediaPosition2 != null) {
                j = mediaPosition2.b.longValue();
                f = this.f.o.c.floatValue();
                elapsedRealtime = this.f.o.d.longValue();
            } else {
                f = 1.0f;
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = -1;
            }
            c11768yR15.f(new PlaybackStateCompat(i, j, 0L, f, j2, 0, null, elapsedRealtime, arrayList, -1L, null));
        }
    }

    public final void a(int i) {
        C11768yR1 c11768yR1;
        C7980nO1 c7980nO1 = this.f;
        if (c7980nO1 != null && c7980nO1.e == i) {
            if (!((c7980nO1.a & 1) != 0) || c7980nO1.c || (c11768yR1 = this.g) == null) {
                return;
            }
            c11768yR1.c(true);
        }
    }
}
