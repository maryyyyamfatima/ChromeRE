package defpackage;

import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeDirection;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeOverscrollMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class CY2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScrollableContainerTypeOverscrollMode.values().length];
        b = iArr;
        try {
            iArr[ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ScrollableContainerTypeDirection.values().length];
        a = iArr2;
        try {
            iArr2[ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
