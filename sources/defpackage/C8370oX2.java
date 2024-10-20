package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oX2 */
/* loaded from: classes.dex */
public final class C8370oX2 {
    public final Tab a;
    public Rect b;
    public Size c;
    public Point d;
    public int e;

    public C8370oX2(Context context, Tab tab) {
        this.a = tab;
        this.e = (int) Math.floor(AbstractC1895Op0.b(context).c.y / ((WebContentsImpl) tab.b()).m.h);
        this.b = new Rect(0, -1, 0, (this.e * 10) - 1);
    }
}
