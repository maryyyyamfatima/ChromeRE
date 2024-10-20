package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: He2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0933He2 {
    public final AbstractC12077zK2 a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public AbstractC0933He2(AbstractC12077zK2 abstractC12077zK2) {
        this.a = abstractC12077zK2;
    }

    public static AbstractC0933He2 a(AbstractC12077zK2 abstractC12077zK2, int i) {
        if (i == 0) {
            return new C0673Fe2(abstractC12077zK2);
        }
        if (i != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0803Ge2(abstractC12077zK2);
    }
}
