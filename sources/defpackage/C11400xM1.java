package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xM1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11400xM1 {
    public final RectF a = new RectF();
    public final Paint b;
    public final Paint c;
    public final Drawable.Callback d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int[] j;
    public int k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public Path p;
    public float q;
    public double r;
    public int s;
    public int t;
    public int u;
    public final Paint v;
    public int w;
    public int x;

    public C11400xM1(C11057wM1 c11057wM1) {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.i = 2.5f;
        this.v = new Paint();
        this.d = c11057wM1;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
    }

    public final void b(int i) {
        this.k = i;
        this.x = this.j[i];
    }

    public final void a() {
        this.d.invalidateDrawable(null);
    }
}
