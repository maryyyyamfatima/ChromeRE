package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9616s84 extends AbstractC9959t84 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public C9616s84(C9616s84 c9616s84, C4317ck c4317ck) {
        AbstractC10302u84 c8931q84;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = c9616s84.c;
        this.d = c9616s84.d;
        this.e = c9616s84.e;
        this.f = c9616s84.f;
        this.g = c9616s84.g;
        this.h = c9616s84.h;
        this.i = c9616s84.i;
        String str = c9616s84.l;
        this.l = str;
        this.k = c9616s84.k;
        if (str != null) {
            c4317ck.put(str, this);
        }
        matrix.set(c9616s84.j);
        ArrayList arrayList = c9616s84.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C9616s84) {
                this.b.add(new C9616s84((C9616s84) obj, c4317ck));
            } else {
                if (obj instanceof C9273r84) {
                    c8931q84 = new C9273r84((C9273r84) obj);
                } else if (obj instanceof C8931q84) {
                    c8931q84 = new C8931q84((C8931q84) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(c8931q84);
                Object obj2 = c8931q84.b;
                if (obj2 != null) {
                    c4317ck.put(obj2, c8931q84);
                }
            }
        }
    }

    public C9616s84() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public float getRotation() {
        return this.c;
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public float getPivotX() {
        return this.d;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public float getPivotY() {
        return this.e;
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public float getScaleX() {
        return this.f;
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public float getScaleY() {
        return this.g;
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public float getTranslateX() {
        return this.h;
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    @Override // defpackage.AbstractC9959t84
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC9959t84) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.AbstractC9959t84
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC9959t84) arrayList.get(i)).b(iArr);
            i++;
        }
    }
}
