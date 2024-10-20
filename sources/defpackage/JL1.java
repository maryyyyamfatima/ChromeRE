package defpackage;

import android.util.SparseArray;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JL1 {
    public static final int[] h = {1, 2, 3};
    public final WebContents a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public C10023tL1 d;
    public C12044zE e;
    public boolean f;
    public final HL1 g;

    public JL1(WebContents webContents) {
        this.a = webContents;
        if (webContents == null) {
            this.g = null;
            return;
        }
        this.f = true;
        HL1 hl1 = new HL1(this, webContents);
        this.g = hl1;
        webContents.h0(hl1);
    }

    public final IL1 a(int i) {
        SparseArray sparseArray = this.b;
        IL1 il1 = (IL1) sparseArray.get(i);
        if (il1 != null) {
            return il1;
        }
        sparseArray.put(i, new IL1());
        return (IL1) sparseArray.get(i);
    }
}
