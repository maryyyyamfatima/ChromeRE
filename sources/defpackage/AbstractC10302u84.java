package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10302u84 extends AbstractC9959t84 {
    public C2667Un2[] a;
    public String b;
    public int c;
    public final int d;

    public AbstractC10302u84() {
        this.a = null;
        this.c = 0;
    }

    public AbstractC10302u84(AbstractC10302u84 abstractC10302u84) {
        this.a = null;
        this.c = 0;
        this.b = abstractC10302u84.b;
        this.d = abstractC10302u84.d;
        this.a = AbstractC2927Wn2.e(abstractC10302u84.a);
    }

    public String getPathName() {
        return this.b;
    }

    public C2667Un2[] getPathData() {
        return this.a;
    }

    public void setPathData(C2667Un2[] c2667Un2Arr) {
        if (!AbstractC2927Wn2.a(this.a, c2667Un2Arr)) {
            this.a = AbstractC2927Wn2.e(c2667Un2Arr);
            return;
        }
        C2667Un2[] c2667Un2Arr2 = this.a;
        for (int i = 0; i < c2667Un2Arr.length; i++) {
            c2667Un2Arr2[i].a = c2667Un2Arr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = c2667Un2Arr[i].b;
                if (i2 < fArr.length) {
                    c2667Un2Arr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
