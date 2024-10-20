package defpackage;

import J.N;
import android.R;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PK3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5561gL3 g;

    @Override // java.lang.Runnable
    public final void run() {
        WebContentsImpl webContentsImpl = this.g.e.k;
        switch (this.a) {
            case R.id.selectAll:
                webContentsImpl.q();
                N.MNvj1u1S(webContentsImpl.g);
                return;
            case R.id.cut:
                webContentsImpl.q();
                N.MhIiCaN7(webContentsImpl.g);
                return;
            case R.id.copy:
                webContentsImpl.q();
                N.MpfMxfut(webContentsImpl.g);
                return;
            case R.id.paste:
                webContentsImpl.q();
                N.MYRJ_nNk(webContentsImpl.g);
                return;
            default:
                return;
        }
    }

    public PK3(C5561gL3 c5561gL3, int i) {
        this.g = c5561gL3;
        this.a = i;
    }
}
