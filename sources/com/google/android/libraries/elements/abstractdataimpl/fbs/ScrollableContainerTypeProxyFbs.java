package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeDirection;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeOverscrollMode;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy;
import com.google.android.libraries.elements.interfaces.SizeProxy;
import defpackage.C2322Rw2;
import defpackage.C8410oe3;
import defpackage.GY2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ScrollableContainerTypeProxyFbs extends ScrollableContainerTypeProxy {
    private final GY2 scrollableContainerTypeFlat;

    public ScrollableContainerTypeProxyFbs(GY2 gy2) {
        this.scrollableContainerTypeFlat = gy2;
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public ScrollableContainerTypeDirection direction() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        int b = gy2.b(4);
        int i = b != 0 ? gy2.b.getInt(b + gy2.a) : 0;
        if (i == 1) {
            return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL;
        }
        if (i == 2) {
            return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL;
        }
        return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN;
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public PointProxy contentOffset() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        C2322Rw2 c2322Rw2 = new C2322Rw2();
        int b = gy2.b(6);
        C2322Rw2 c2322Rw22 = null;
        if (b != 0) {
            c2322Rw2.a(b + gy2.a, gy2.b);
        } else {
            c2322Rw2 = null;
        }
        if (c2322Rw2 == null) {
            return null;
        }
        GY2 gy22 = this.scrollableContainerTypeFlat;
        C2322Rw2 c2322Rw23 = new C2322Rw2();
        int b2 = gy22.b(6);
        if (b2 != 0) {
            c2322Rw23.a(b2 + gy22.a, gy22.b);
            c2322Rw22 = c2322Rw23;
        }
        return new PointProxyFbs(c2322Rw22);
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public SizeProxy contentSize() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        C8410oe3 c8410oe3 = new C8410oe3();
        int b = gy2.b(8);
        C8410oe3 c8410oe32 = null;
        if (b != 0) {
            c8410oe3.a(b + gy2.a, gy2.b);
        } else {
            c8410oe3 = null;
        }
        if (c8410oe3 == null) {
            return null;
        }
        GY2 gy22 = this.scrollableContainerTypeFlat;
        C8410oe3 c8410oe33 = new C8410oe3();
        int b2 = gy22.b(8);
        if (b2 != 0) {
            c8410oe33.a(b2 + gy22.a, gy22.b);
            c8410oe32 = c8410oe33;
        }
        return new SizeProxyFbs(c8410oe32);
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public boolean showHorizontalIndicator() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        int b = gy2.b(10);
        return (b == 0 || gy2.b.get(b + gy2.a) == 0) ? false : true;
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public boolean showVerticalIndicator() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        int b = gy2.b(12);
        return (b == 0 || gy2.b.get(b + gy2.a) == 0) ? false : true;
    }

    @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
    public ScrollableContainerTypeOverscrollMode overscrollMode() {
        GY2 gy2 = this.scrollableContainerTypeFlat;
        int b = gy2.b(20);
        int i = b != 0 ? gy2.b.getInt(b + gy2.a) : 0;
        if (i == 1) {
            return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER;
        }
        if (i == 2) {
            return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS;
        }
        if (i == 3) {
            return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS;
        }
        return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED;
    }
}
