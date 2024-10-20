package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H93 implements InterfaceC9395rX {
    public final InterfaceScheduledExecutorServiceC4493dE1 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C6315iZ c6315iZ;
        F93 f93 = (F93) obj;
        if (f93 == null) {
            c6315iZ = new C6315iZ(new IllegalArgumentException("Invalid command parameter to ShowShareSheetCommand.onCommand"));
        } else if (abstractC9053qX == null) {
            c6315iZ = new C6315iZ(new IllegalArgumentException("Invalid eventData parameter to ShowShareSheetCommand.onCommand"));
        } else {
            if ((f93.j & 8) != 0) {
                InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
                if (a != null) {
                    I93 i93 = f93.n;
                    if (i93 == null) {
                        i93 = I93.o;
                    }
                    String str = i93.m;
                    String str2 = i93.k;
                    FeedStream feedStream = ((C3835bK0) a).a;
                    C7615mK0 c7615mK0 = feedStream.g;
                    WindowAndroid windowAndroid = c7615mK0.a;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                        str = ((GURL) N.M1WDPiaY(str)).i();
                    }
                    ((J63) c7615mK0.b.get()).c(new C6862k73(windowAndroid, str2, null, null, str, null, null, null, null, null, null, null, null, null), new EP(false, false, false, null, null, false, false, false, null, 0), 8);
                    N.MakGUIs_(feedStream.d, feedStream, 29);
                    J93 j93 = (J93) K93.l.j();
                    if (j93.h) {
                        j93.l();
                        j93.h = false;
                    }
                    K93 k93 = (K93) j93.g;
                    k93.getClass();
                    k93.k = 0;
                    k93.j |= 1;
                    final C9803si1 c = AbstractC5957hW0.c((K93) j93.j());
                    return new C4596dZ(new IZ(new DK3() { // from class: G93
                        @Override // defpackage.DK3, j$.util.function.Supplier
                        public final Object get() {
                            return c;
                        }
                    }, this.a));
                }
                c6315iZ = new C6315iZ(new IllegalArgumentException("No corresponding actions handler found in eventData."));
            } else {
                c6315iZ = new C6315iZ(new IllegalArgumentException("Command parameter does not have ShowShareSheetRequest"));
            }
        }
        return c6315iZ;
    }

    public H93(InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1) {
        this.a = interfaceScheduledExecutorServiceC4493dE1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return F93.q;
    }
}
