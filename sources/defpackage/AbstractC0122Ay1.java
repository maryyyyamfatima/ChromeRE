package defpackage;

import com.google.android.libraries.elements.interfaces.DimensionUnit;
import com.google.android.libraries.elements.interfaces.FlexWrap;
import com.google.android.libraries.elements.interfaces.JustifyContent;
import com.google.android.libraries.elements.interfaces.Position;
import com.google.android.libraries.elements.interfaces.SemanticContentAttribute;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ay1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0122Ay1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[SemanticContentAttribute.values().length];
        e = iArr;
        try {
            iArr[SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            e[SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            e[SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            e[SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            e[SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[JustifyContent.values().length];
        d = iArr2;
        try {
            iArr2[JustifyContent.JUSTIFY_CONTENT_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_FLEX_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_FLEX_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_CENTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_BETWEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_SPACE_AROUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            d[JustifyContent.JUSTIFY_CONTENT_SPACE_EVENLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        int[] iArr3 = new int[FlexWrap.values().length];
        c = iArr3;
        try {
            iArr3[FlexWrap.FLEX_WRAP_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            c[FlexWrap.FLEX_WRAP_NO_WRAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            c[FlexWrap.FLEX_WRAP_WRAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            c[FlexWrap.FLEX_WRAP_WRAP_REVERSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        int[] iArr4 = new int[Position.values().length];
        b = iArr4;
        try {
            iArr4[Position.POSITION_ABSOLUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            b[Position.POSITION_UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            b[Position.POSITION_RELATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        int[] iArr5 = new int[DimensionUnit.values().length];
        a = iArr5;
        try {
            iArr5[DimensionUnit.DIMENSION_UNIT_FRACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            a[DimensionUnit.DIMENSION_UNIT_UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            a[DimensionUnit.DIMENSION_UNIT_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
    }
}
