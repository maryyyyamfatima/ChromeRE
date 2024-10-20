package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;
import com.google.android.libraries.elements.interfaces.StylePropertiesProxy;
import defpackage.C2322Rw2;
import defpackage.C8126no3;
import defpackage.JI2;
import defpackage.UP0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class StylePropertiesProxyImplFbs extends StylePropertiesProxy {
    private final PointProxy point;
    private final RectCornersProxy rectCorners;
    private final C8126no3 styleProperties;

    public StylePropertiesProxyImplFbs(C8126no3 c8126no3) {
        RectCornersProxyFbsImpl rectCornersProxyFbsImpl;
        this.styleProperties = c8126no3;
        c8126no3.getClass();
        JI2 ji2 = new JI2();
        int b = c8126no3.b(14);
        PointProxyFbs pointProxyFbs = null;
        C2322Rw2 c2322Rw2 = null;
        if (b != 0) {
            ji2.c(c8126no3.a(b + c8126no3.a), c8126no3.b);
        } else {
            ji2 = null;
        }
        if (ji2 == null) {
            rectCornersProxyFbsImpl = null;
        } else {
            JI2 ji22 = new JI2();
            int b2 = c8126no3.b(14);
            if (b2 != 0) {
                ji22.c(c8126no3.a(b2 + c8126no3.a), c8126no3.b);
            } else {
                ji22 = null;
            }
            rectCornersProxyFbsImpl = new RectCornersProxyFbsImpl(ji22);
        }
        this.rectCorners = rectCornersProxyFbsImpl;
        C2322Rw2 c2322Rw22 = new C2322Rw2();
        int b3 = c8126no3.b(26);
        if (b3 != 0) {
            c2322Rw22.a(b3 + c8126no3.a, c8126no3.b);
        } else {
            c2322Rw22 = null;
        }
        if (c2322Rw22 != null) {
            C2322Rw2 c2322Rw23 = new C2322Rw2();
            int b4 = c8126no3.b(26);
            if (b4 != 0) {
                c2322Rw23.a(b4 + c8126no3.a, c8126no3.b);
                c2322Rw2 = c2322Rw23;
            }
            pointProxyFbs = new PointProxyFbs(c2322Rw2);
        }
        this.point = pointProxyFbs;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasRotation() {
        return UP0.l(this.styleProperties, 24);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public float rotation() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(24);
        if (b != 0) {
            return c8126no3.b.getFloat(b + c8126no3.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasScale() {
        return UP0.l(this.styleProperties, 24);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public float scale() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(22);
        if (b != 0) {
            return c8126no3.b.getFloat(b + c8126no3.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasOpaque() {
        return UP0.l(this.styleProperties, 24);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean opaque() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(18);
        return (b == 0 || c8126no3.b.get(b + c8126no3.a) == 0) ? false : true;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasOpacity() {
        return UP0.l(this.styleProperties, 6);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public float opacity() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(6);
        if (b != 0) {
            return c8126no3.b.getFloat(b + c8126no3.a);
        }
        return 1.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasBackgroundColor() {
        return UP0.l(this.styleProperties, 4);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public long backgroundColor() {
        if (this.styleProperties.b(4) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasBorderColor() {
        return UP0.l(this.styleProperties, 8);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public long borderColor() {
        if (this.styleProperties.b(8) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasBorderWidth() {
        return UP0.l(this.styleProperties, 10);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public float borderWidth() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(10);
        if (b != 0) {
            return c8126no3.b.getFloat(b + c8126no3.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasBorderRadius() {
        return UP0.l(this.styleProperties, 12);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public float borderRadius() {
        C8126no3 c8126no3 = this.styleProperties;
        int b = c8126no3.b(12);
        if (b != 0) {
            return c8126no3.b.getFloat(b + c8126no3.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean hasClipBounds() {
        return UP0.l(this.styleProperties, 16);
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public boolean clipBounds() {
        return this.styleProperties.h();
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public PointProxy translation() {
        return this.point;
    }

    @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
    public RectCornersProxy borderRadiusCorners() {
        return this.rectCorners;
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class RectCornersProxyFbsImpl extends RectCornersProxy {
        private final JI2 rectCorners;

        public RectCornersProxyFbsImpl(JI2 ji2) {
            this.rectCorners = ji2;
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopLeft() {
            return UP0.l(this.rectCorners, 4);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topLeft() {
            return this.rectCorners.m();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopRight() {
            return UP0.l(this.rectCorners, 6);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topRight() {
            return this.rectCorners.n();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomLeft() {
            return UP0.l(this.rectCorners, 8);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomLeft() {
            return this.rectCorners.i();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomRight() {
            return UP0.l(this.rectCorners, 10);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomRight() {
            return this.rectCorners.j();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopStart() {
            return UP0.l(this.rectCorners, 12);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topStart() {
            return this.rectCorners.o();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopEnd() {
            return UP0.l(this.rectCorners, 14);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topEnd() {
            return this.rectCorners.l();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomStart() {
            return UP0.l(this.rectCorners, 16);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomStart() {
            return this.rectCorners.k();
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomEnd() {
            return UP0.l(this.rectCorners, 18);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomEnd() {
            return this.rectCorners.h();
        }
    }
}
