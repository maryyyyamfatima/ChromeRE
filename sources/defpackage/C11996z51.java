package defpackage;

import J.N;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z51 */
/* loaded from: classes5.dex */
public final class C11996z51 {
    public final PropertyModel a;
    public final Runnable b;
    public final Runnable c;
    public final Runnable d;
    public final String e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public int k;
    public PointF l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;

    public C11996z51(Context context, PropertyModel propertyModel, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.a = propertyModel;
        this.b = runnable;
        this.c = runnable2;
        this.d = runnable3;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08034c);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080349);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08034e);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080351);
        this.e = context.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1409b5);
        propertyModel.o(B51.j, this);
        this.k = 1;
    }

    public final void i(int i, int i2, String str) {
        boolean isEmpty = str.isEmpty();
        if (isEmpty) {
            i2 = 0;
        }
        ND2 nd2 = B51.h;
        PropertyModel propertyModel = this.a;
        propertyModel.m(nd2, i);
        propertyModel.m(B51.d, i2);
        PD2 pd2 = B51.g;
        if (isEmpty) {
            str = this.e;
        }
        propertyModel.o(pd2, str);
        propertyModel.k(B51.f, isEmpty);
        propertyModel.k(B51.a, true);
        propertyModel.k(B51.k, true);
    }

    public final boolean g(float f, float f2, float f3, float f4) {
        if (f >= f3) {
            int i = this.g;
            if (f <= f3 + i && f2 >= f4 && f2 <= f4 + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(View view, MotionEvent motionEvent) {
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        int i = this.g;
        return g(motionEvent.getX(), motionEvent.getY(), isLayoutRtl ? view.getWidth() - i : 0.0f, view.getHeight() - i);
    }

    public final boolean f(View view, MotionEvent motionEvent) {
        return g(motionEvent.getX(), motionEvent.getY(), LocalizationUtils.isLayoutRtl() ? 0.0f : view.getWidth() - this.g, 0.0f);
    }

    public final void h(View view, float f, float f2) {
        this.a.o(B51.c, new PointF(f + (view.getWidth() / 2), f2 + (view.getHeight() / 2)));
    }

    public final boolean a(TextView textView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 4;
            return true;
        }
        if (action != 1) {
            return false;
        }
        this.k = 1;
        if (!e(textView, motionEvent)) {
            return false;
        }
        if (this.a.j(B51.f)) {
            return false;
        }
        this.c.run();
        int height = textView.getHeight();
        float f = height - (this.h * 2);
        float f2 = 0.0f;
        if (textView.getY() + height + f > this.j + r0) {
            if (textView.getY() - f >= (-r0)) {
                f *= -1.0f;
            } else {
                int i = LocalizationUtils.isLayoutRtl() ? -1 : 1;
                int i2 = this.i;
                f2 = i * i2;
                f = i2;
            }
        }
        h(textView, textView.getX() + f2, textView.getY() + f);
        AbstractC9454rh1.a(8);
        return true;
    }

    public final boolean b(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 5;
            return true;
        }
        if (action != 1) {
            return false;
        }
        this.k = 1;
        if (!f(view, motionEvent)) {
            return false;
        }
        AbstractC9454rh1.a(11);
        this.d.run();
        return true;
    }

    public final boolean c(TextView textView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 3;
            PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
            PointF pointF2 = new PointF(textView.getX() + (textView.getWidth() / 2.0f), textView.getY() + (textView.getHeight() / 2.0f));
            this.l = pointF2;
            float f = pointF2.x;
            float f2 = pointF2.y;
            float f3 = pointF.x - f;
            float f4 = pointF.y - f2;
            this.m = (float) Math.sqrt((f4 * f4) + (f3 * f3));
            this.n = textView.getTextSize();
            PointF pointF3 = this.l;
            this.o = textView.getRotation() - (((float) Math.toDegrees((float) Math.atan2(pointF.y - pointF3.y, pointF.x - pointF3.x))) % 360.0f);
            return true;
        }
        if (action == 1) {
            this.k = 1;
            this.v = false;
            this.w = false;
            return true;
        }
        if (action != 2) {
            return false;
        }
        PointF pointF4 = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        PointF pointF5 = this.l;
        float f5 = pointF5.x;
        float f6 = pointF5.y;
        float f7 = pointF4.x - f5;
        float f8 = pointF4.y - f6;
        float sqrt = ((float) Math.sqrt((f8 * f8) + (f7 * f7))) / this.m;
        if (sqrt != 1.0f && !this.w) {
            AbstractC9454rh1.a(9);
            this.w = true;
        }
        float f9 = this.n * sqrt;
        MD2 md2 = B51.i;
        PropertyModel propertyModel = this.a;
        propertyModel.l(md2, f9);
        propertyModel.m(B51.d, textView.getWidth());
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ScreenshotsForAndroidV2") && propertyModel.j(B51.k)) {
            float f10 = f9 * 0.04f;
            textView.setShadowLayer(f10, f10, f10, -14013910);
        }
        PointF pointF6 = this.l;
        float degrees = ((float) Math.toDegrees((float) Math.atan2(pointF4.y - pointF6.y, pointF4.x - pointF6.x))) % 360.0f;
        if (Math.abs(degrees) > 0.001f && !this.v) {
            AbstractC9454rh1.a(10);
            this.v = true;
        }
        float f11 = (degrees + this.o) % 360.0f;
        if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        propertyModel.l(B51.e, f11);
        return true;
    }

    public final boolean d(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 2;
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.r = motionEvent.getEventTime();
            this.s = view.getX() - motionEvent.getRawX();
            this.t = view.getY() - motionEvent.getRawY();
            this.u = false;
            return true;
        }
        if (action == 1) {
            this.k = 1;
            long eventTime = motionEvent.getEventTime() - this.r;
            if (!this.u && eventTime < 400) {
                this.b.run();
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        h(view, motionEvent.getRawX() + this.s, motionEvent.getRawY() + this.t);
        float abs = Math.abs(this.p - motionEvent.getRawX());
        float f = this.f;
        if (abs > f || Math.abs(this.q - motionEvent.getRawY()) > f) {
            this.u = true;
        }
        return true;
    }
}
