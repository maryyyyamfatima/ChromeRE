package org.chromium.chrome.browser.profiles;

import J.N;
import defpackage.AbstractC0185Bl;
import defpackage.C11814ya2;
import defpackage.InterfaceC10665vC2;
import defpackage.X80;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Profile implements BrowserContextHandle {
    public final OTRProfileID a;
    public long b;

    public Profile(long j) {
        this.b = j;
        if (N.MEt51B0E(j, this)) {
            this.a = (OTRProfileID) N.MyopTl49(this.b, this);
        } else {
            this.a = null;
        }
    }

    public static Profile d() {
        Object obj = ThreadUtils.a;
        if (!ProfileManager.b) {
            throw new IllegalStateException("Browser hasn't finished initialization yet!");
        }
        return (Profile) N.M_3GXkeQ();
    }

    public static int c(Profile profile) {
        if (profile.i()) {
            return N.MWNOGDsM(profile.b, profile) ? 1 : 4;
        }
        return 0;
    }

    public final Profile e(OTRProfileID oTRProfileID) {
        return (Profile) N.MIzCSj22(this.b, this, oTRProfileID, true);
    }

    public final Profile f(boolean z) {
        return (Profile) N.Mhxya0Qy(this.b, this, z);
    }

    public final ProfileKey g() {
        return (ProfileKey) N.MjGj0xKY(this.b, this);
    }

    public final boolean i() {
        return this.a != null;
    }

    public final boolean h() {
        return N.MBL3czGJ(this.b, this);
    }

    @Override // org.chromium.content_public.browser.BrowserContextHandle
    public final long a() {
        return N.MgjF0wyD(this.b);
    }

    public static Profile create(long j) {
        return new Profile(j);
    }

    public final void onNativeDestroyed() {
        this.b = 0L;
        if (this.a != null) {
            try {
                Profile d = d();
                if (!N.MrGvO7pv(d.b, d)) {
                    new X80().c(AbstractC0185Bl.f);
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        Iterator it = ProfileManager.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC10665vC2) c11814ya2.next()).d(this);
            }
        }
    }

    public final long getNativePointer() {
        return this.b;
    }

    public static Profile b(WebContents webContents) {
        return (Profile) N.MvvJTucy(webContents);
    }
}
