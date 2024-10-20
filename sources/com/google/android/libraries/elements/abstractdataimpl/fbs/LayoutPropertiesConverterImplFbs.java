package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.AlignItems;
import com.google.android.libraries.elements.interfaces.DimensionEdgesProxy;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.FlexDirection;
import com.google.android.libraries.elements.interfaces.FlexWrap;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.JustifyContent;
import com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy;
import com.google.android.libraries.elements.interfaces.Position;
import com.google.android.libraries.elements.interfaces.SemanticContentAttribute;
import defpackage.C0976Hn0;
import defpackage.C1106In0;
import defpackage.C11269wy1;
import defpackage.UP0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LayoutPropertiesConverterImplFbs extends LayoutPropertiesProxy {
    private final C11269wy1 layoutProperties;

    public LayoutPropertiesConverterImplFbs(C11269wy1 c11269wy1) {
        this.layoutProperties = c11269wy1;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionEdgesProxy position() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        c11269wy1.getClass();
        C1106In0 c1106In0 = new C1106In0();
        int b = c11269wy1.b(4);
        if (b != 0) {
            c1106In0.c(c11269wy1.a(b + c11269wy1.a), c11269wy1.b);
        } else {
            c1106In0 = null;
        }
        return returnValue(c1106In0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy height() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(6);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy width() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(8);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy minWidth() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(10);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy minHeight() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(12);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy maxWidth() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(14);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy maxHeight() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(16);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionEdgesProxy margin() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        c11269wy1.getClass();
        C1106In0 c1106In0 = new C1106In0();
        int b = c11269wy1.b(18);
        if (b != 0) {
            c1106In0.c(c11269wy1.a(b + c11269wy1.a), c11269wy1.b);
        } else {
            c1106In0 = null;
        }
        return returnValue(c1106In0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionEdgesProxy padding() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        c11269wy1.getClass();
        C1106In0 c1106In0 = new C1106In0();
        int b = c11269wy1.b(20);
        if (b != 0) {
            c1106In0.c(c11269wy1.a(b + c11269wy1.a), c11269wy1.b);
        } else {
            c1106In0 = null;
        }
        return returnValue(c1106In0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public FlexDirection flexDirection() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(22);
        int i = b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0;
        if (i == 1) {
            return FlexDirection.FLEX_DIRECTION_ROW;
        }
        if (i == 2) {
            return FlexDirection.FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i == 3) {
            return FlexDirection.FLEX_DIRECTION_COLUMN;
        }
        if (i == 4) {
            return FlexDirection.FLEX_DIRECTION_COLUMN_REVERSE;
        }
        return FlexDirection.FLEX_DIRECTION_UNKNOWN;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public JustifyContent justifyContent() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(24);
        switch (b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0) {
            case 1:
                return JustifyContent.JUSTIFY_CONTENT_FLEX_START;
            case 2:
                return JustifyContent.JUSTIFY_CONTENT_FLEX_END;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return JustifyContent.JUSTIFY_CONTENT_CENTER;
            case 4:
                return JustifyContent.JUSTIFY_CONTENT_BETWEEN;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return JustifyContent.JUSTIFY_CONTENT_SPACE_AROUND;
            case 6:
                return JustifyContent.JUSTIFY_CONTENT_SPACE_EVENLY;
            default:
                return JustifyContent.JUSTIFY_CONTENT_UNKNOWN;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public AlignItems alignContent() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(26);
        return getAlignItems(b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public AlignItems alignItems() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(28);
        return getAlignItems(b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public float flexGrow() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(30);
        if (b != 0) {
            return c11269wy1.b.getFloat(b + c11269wy1.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public boolean hasFlexGrow() {
        return UP0.l(this.layoutProperties, 30);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public float flexShrink() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(32);
        if (b != 0) {
            return c11269wy1.b.getFloat(b + c11269wy1.a);
        }
        return 1.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public boolean hasFlexShrink() {
        return UP0.l(this.layoutProperties, 32);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public DimensionProxy flexBasis() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        C0976Hn0 c0976Hn0 = new C0976Hn0();
        int b = c11269wy1.b(34);
        if (b != 0) {
            c0976Hn0.a(b + c11269wy1.a, c11269wy1.b);
        } else {
            c0976Hn0 = null;
        }
        return DimensionEdgesProxyImplFbs.returnValue(c0976Hn0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public AlignItems alignSelf() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(36);
        return getAlignItems(b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public Position positionType() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(38);
        int i = b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0;
        if (i == 1) {
            return Position.POSITION_RELATIVE;
        }
        if (i == 2) {
            return Position.POSITION_ABSOLUTE;
        }
        return Position.POSITION_UNKNOWN;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public boolean hasAspectRatio() {
        return UP0.l(this.layoutProperties, 40);
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public float aspectRatio() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(40);
        if (b != 0) {
            return c11269wy1.b.getFloat(b + c11269wy1.a);
        }
        return 0.0f;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public SemanticContentAttribute semanticContentAttribute() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(42);
        int i = b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0;
        if (i == 1) {
            return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR;
        }
        if (i == 2) {
            return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL;
        }
        if (i == 3) {
            return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK;
        }
        if (i == 4) {
            return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL;
        }
        return SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN;
    }

    @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
    public FlexWrap flexWrap() {
        C11269wy1 c11269wy1 = this.layoutProperties;
        int b = c11269wy1.b(44);
        int i = b != 0 ? c11269wy1.b.getInt(b + c11269wy1.a) : 0;
        if (i == 1) {
            return FlexWrap.FLEX_WRAP_NO_WRAP;
        }
        if (i == 2) {
            return FlexWrap.FLEX_WRAP_WRAP;
        }
        if (i == 3) {
            return FlexWrap.FLEX_WRAP_WRAP_REVERSE;
        }
        return FlexWrap.FLEX_WRAP_UNKNOWN;
    }

    public static DimensionEdgesProxy returnValue(C1106In0 c1106In0) {
        if (c1106In0 != null) {
            return new DimensionEdgesProxyImplFbs(c1106In0);
        }
        return null;
    }

    private AlignItems getAlignItems(int i) {
        switch (i) {
            case 1:
                return AlignItems.ALIGN_ITEMS_AUTO;
            case 2:
                return AlignItems.ALIGN_ITEMS_START;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return AlignItems.ALIGN_ITEMS_END;
            case 4:
                return AlignItems.ALIGN_ITEMS_CENTER;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return AlignItems.ALIGN_ITEMS_STRETCH;
            case 6:
                return AlignItems.ALIGN_ITEMS_BASELINE_FIRST;
            case 7:
                return AlignItems.ALIGN_ITEMS_BASELINE_LAST;
            default:
                return AlignItems.ALIGN_ITEMS_UNKNOWN;
        }
    }
}
