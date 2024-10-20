package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2214Rb extends AbstractC8789pk3 {
    public C1564Mb u;
    public AbstractC2084Qb v;
    public int w = -1;
    public int x = -1;
    public boolean y;

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public C2214Rb(C1564Mb c1564Mb, Resources resources) {
        d(new C1564Mb(c1564Mb, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0273, code lost:            r4.onStateChange(r4.getState());     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x027a, code lost:            return r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:            if (r5 == null) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:            r5 = r25.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:            if (r5 != 4) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:            if (r5 != 2) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:            if (r25.getName().equals("vector") == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:            r5 = new defpackage.C11674y84();        r5.inflate(r1, r3, r2, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:            r5 = android.graphics.drawable.Drawable.createFromXmlInner(r1, r3, r2, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:            if (r5 == null) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:            r10 = r4.u;        r5 = r10.a(r5);        r10.H[r5] = r7;        r10.f11456J.g(r5, java.lang.Integer.valueOf(r16));     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C2214Rb e(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2214Rb.e(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):Rb");
    }

    @Override // defpackage.AbstractC1136It0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC2084Qb abstractC2084Qb = this.v;
        if (abstractC2084Qb != null && (visible || z2)) {
            if (z) {
                abstractC2084Qb.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // defpackage.AbstractC1136It0, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC2084Qb abstractC2084Qb = this.v;
        if (abstractC2084Qb != null) {
            abstractC2084Qb.d();
            this.v = null;
            c(this.w);
            this.w = -1;
            this.x = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    @Override // defpackage.AbstractC8789pk3, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2214Rb.onStateChange(int[]):boolean");
    }

    @Override // defpackage.AbstractC8789pk3, defpackage.AbstractC1136It0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.y) {
            super.mutate();
            this.u.e();
            this.y = true;
        }
        return this;
    }

    @Override // defpackage.AbstractC1136It0
    public final void d(C1564Mb c1564Mb) {
        this.a = c1564Mb;
        int i = this.l;
        if (i >= 0) {
            Drawable d = c1564Mb.d(i);
            this.h = d;
            if (d != null) {
                b(d);
            }
        }
        this.i = null;
        if (c1564Mb instanceof AbstractC8446ok3) {
            this.s = c1564Mb;
        }
        if (c1564Mb instanceof C1564Mb) {
            this.u = c1564Mb;
        }
    }
}
