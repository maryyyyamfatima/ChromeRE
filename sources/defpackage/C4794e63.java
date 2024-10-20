package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4794e63 extends AbstractC6856k63 {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public C4794e63(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.AbstractC6856k63
    public final void a(Matrix matrix, M53 m53, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AbstractC6856k63) it.next()).a(this.d, m53, i, canvas);
        }
    }
}
