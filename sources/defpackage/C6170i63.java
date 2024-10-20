package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6170i63 extends AbstractC6512j63 {
    public float b;
    public float c;

    @Override // defpackage.AbstractC6512j63
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
