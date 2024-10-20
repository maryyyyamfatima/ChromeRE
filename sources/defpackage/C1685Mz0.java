package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1685Mz0 extends AbstractC1555Lz0 {
    public final C1426Kz0 a;

    public C1685Mz0(TextView textView) {
        this.a = new C1426Kz0(textView);
    }

    @Override // defpackage.AbstractC1555Lz0
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        Object obj = AbstractC7499lz0.a;
        return inputFilterArr;
    }

    @Override // defpackage.AbstractC1555Lz0
    public final void c(boolean z) {
        Object obj = AbstractC7499lz0.a;
    }

    @Override // defpackage.AbstractC1555Lz0
    public final void d(boolean z) {
        Object obj = AbstractC7499lz0.a;
        this.a.c = z;
    }

    @Override // defpackage.AbstractC1555Lz0
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        Object obj = AbstractC7499lz0.a;
        return transformationMethod;
    }

    @Override // defpackage.AbstractC1555Lz0
    public final boolean b() {
        return this.a.c;
    }
}
