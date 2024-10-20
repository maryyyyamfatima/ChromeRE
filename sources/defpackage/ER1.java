package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Collections;
import java.util.Set;
import org.chromium.base.SysUtils;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.services.media_session.MediaPosition;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ER1 implements VN1 {
    public final SR1 a;
    public WebContents b;
    public CR1 c;
    public BR1 d;
    public final WN1 e;
    public Bitmap f;
    public Bitmap g;
    public Bitmap h;
    public String i;
    public final int j;
    public C7636mO1 k;
    public String l;
    public boolean m;
    public MediaMetadata n;
    public MediaMetadata o;
    public MediaPosition q;
    public final Handler r;
    public Runnable s;
    public LargeIconBridge t;
    public Set p = Collections.emptySet();
    public final C12111zR1 u = new C12111zR1(this);

    public final void f() {
        C7980nO1 c7980nO1;
        int id = this.a.a.getId();
        C6948kO1 c6948kO1 = (C6948kO1) AbstractC8667pO1.a.get(R.id.media_playback_notification);
        if (c6948kO1 != null && (c7980nO1 = c6948kO1.f) != null && id == c7980nO1.e) {
            c6948kO1.b();
        }
        Activity d = d();
        if (d != null) {
            d.setVolumeControlStream(this.j);
        }
    }

    public final void i() {
        Runnable runnable = this.s;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
            this.s = null;
        }
        C7980nO1 a = this.k.a();
        this.a.getClass();
        AbstractC11751yO.a(a);
    }

    public final void h(WebContents webContents) {
        if (this.b == webContents) {
            return;
        }
        this.b = webContents;
        CR1 cr1 = this.c;
        if (cr1 != null) {
            cr1.destroy();
        }
        this.c = new CR1(this, webContents, webContents);
        MediaSessionImpl mediaSessionImpl = (MediaSessionImpl) N.Mtun$qW8(webContents);
        BR1 br1 = this.d;
        if (br1 == null || mediaSessionImpl != br1.a) {
            b();
            WN1 wn1 = this.e;
            wn1.a = webContents;
            wn1.c = -1;
            wn1.d = null;
            if (mediaSessionImpl != null) {
                this.d = new BR1(this, mediaSessionImpl);
            }
        }
    }

    public final void b() {
        BR1 br1 = this.d;
        if (br1 == null) {
            return;
        }
        MediaSessionImpl mediaSessionImpl = br1.a;
        if (mediaSessionImpl != null) {
            mediaSessionImpl.b.d(br1);
            br1.a = null;
        }
        this.d = null;
        this.p = Collections.emptySet();
    }

    public ER1(WebContents webContents, SR1 sr1) {
        this.j = Integer.MIN_VALUE;
        this.a = sr1;
        this.e = new WN1(SysUtils.isLowEndDevice() ? 256 : 512);
        this.r = new Handler();
        h(webContents);
        Activity d = d();
        if (d != null) {
            this.j = d.getVolumeControlStream();
        }
    }

    public static Integer c(int i) {
        if (i == 1000) {
            return 0;
        }
        if (i == 1001) {
            return 1;
        }
        return i == 1002 ? 2 : null;
    }

    public final Activity d() {
        WindowAndroid Q0 = this.b.Q0();
        if (Q0 == null) {
            return null;
        }
        return (Activity) Q0.k().get();
    }

    public final void j(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.m = true;
        if (g() || this.f != null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26 || !SysUtils.isLowEndDevice()) {
            if (bitmap.getWidth() >= 114 && bitmap.getHeight() >= 114) {
                if (this.g == null || (bitmap.getWidth() >= this.g.getWidth() && bitmap.getHeight() >= this.g.getHeight())) {
                    Bitmap a = AbstractC7292lO1.a(bitmap);
                    this.g = a;
                    if (this.h == a) {
                        return;
                    }
                    this.h = a;
                    if (g()) {
                        return;
                    }
                    C7636mO1 c7636mO1 = this.k;
                    c7636mO1.g = this.h;
                    c7636mO1.i = this.f;
                    i();
                }
            }
        }
    }

    public static void a(ER1 er1) {
        if (er1.g()) {
            return;
        }
        MediaMetadata e = er1.e();
        if (er1.o.equals(e)) {
            return;
        }
        er1.o = e;
        er1.k.a = e;
        er1.i();
    }

    public final MediaMetadata e() {
        String str;
        String str2;
        String str3 = this.l;
        MediaMetadata mediaMetadata = this.n;
        if (mediaMetadata == null) {
            str = "";
            str2 = "";
        } else {
            if (!TextUtils.isEmpty(mediaMetadata.a)) {
                return this.n;
            }
            MediaMetadata mediaMetadata2 = this.n;
            str = mediaMetadata2.b;
            str2 = mediaMetadata2.c;
        }
        MediaMetadata mediaMetadata3 = this.o;
        if (mediaMetadata3 != null && TextUtils.equals(str3, mediaMetadata3.a) && TextUtils.equals(str, this.o.b) && TextUtils.equals(str2, this.o.c)) {
            return this.o;
        }
        return new MediaMetadata(str3, str, str2);
    }

    public final boolean g() {
        return this.k == null;
    }
}
