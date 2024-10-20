package defpackage;

import java.util.HashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.sync.SyncServiceImpl;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1658Mt3 {
    public static SyncServiceImpl a;
    public static boolean b;

    public abstract void a(InterfaceC1528Lt3 interfaceC1528Lt3);

    public abstract CoreAccountInfo c();

    public abstract int d();

    public abstract HashSet e();

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract void l(InterfaceC1528Lt3 interfaceC1528Lt3);

    public abstract void m(int i);

    public static AbstractC1658Mt3 b() {
        Object obj = ThreadUtils.a;
        if (!b) {
            SyncServiceImpl syncServiceImpl = new SyncServiceImpl();
            if (syncServiceImpl.c == 0) {
                syncServiceImpl = null;
            }
            a = syncServiceImpl;
            b = true;
        }
        return a;
    }
}
