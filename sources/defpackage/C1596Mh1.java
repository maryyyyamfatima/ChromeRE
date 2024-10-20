package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596Mh1 extends Property {
    public final Matrix a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix matrix = this.a;
        matrix.set(((ImageView) obj).getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }

    public C1596Mh1() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }
}
