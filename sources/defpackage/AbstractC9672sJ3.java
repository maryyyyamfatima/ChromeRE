package defpackage;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sJ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9672sJ3 {
    public static final TextUtils.TruncateAt[] a;
    public static final UG3 b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            AtomicBoolean atomicBoolean = AbstractC3348Zt3.a;
        } else if (!AbstractC3348Zt3.a.getAndSet(true)) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("sTypefaceCache");
                declaredField.setAccessible(true);
                Object obj = new Object();
                synchronized (obj) {
                    LongSparseArray longSparseArray = (LongSparseArray) declaredField.get(null);
                    C3088Xt3 c3088Xt3 = new C3088Xt3(longSparseArray.size(), obj);
                    declaredField.set(null, c3088Xt3);
                    int size = longSparseArray.size();
                    for (int i = 0; i < size; i++) {
                        c3088Xt3.append(longSparseArray.keyAt(i), new C3218Yt3((SparseArray) longSparseArray.valueAt(i)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        a = TextUtils.TruncateAt.values();
        b = UG3.TEXT_START;
    }

    public static void b(TypedArray typedArray, C3272Ze2 c3272Ze2, C3272Ze2 c3272Ze22, C3272Ze2 c3272Ze23, C3272Ze2 c3272Ze24, C3272Ze2 c3272Ze25, C3272Ze2 c3272Ze26, C3272Ze2 c3272Ze27, C3272Ze2 c3272Ze28, C3272Ze2 c3272Ze29, C3272Ze2 c3272Ze210, C3272Ze2 c3272Ze211, C3272Ze2 c3272Ze212, C3272Ze2 c3272Ze213, C3272Ze2 c3272Ze214, C3272Ze2 c3272Ze215, C3272Ze2 c3272Ze216, C3272Ze2 c3272Ze217, C3272Ze2 c3272Ze218, C3272Ze2 c3272Ze219, C3272Ze2 c3272Ze220, C3272Ze2 c3272Ze221, C3272Ze2 c3272Ze222, C3272Ze2 c3272Ze223, C3272Ze2 c3272Ze224, C3272Ze2 c3272Ze225, C3272Ze2 c3272Ze226, C3272Ze2 c3272Ze227) {
        int i;
        int i2;
        C3272Ze2 c3272Ze228 = c3272Ze217;
        int indexCount = typedArray.getIndexCount();
        int i3 = 0;
        String str = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i4 < indexCount) {
            int index = typedArray.getIndex(i4);
            if (index == 9) {
                c3272Ze212.a = typedArray.getString(index);
            } else if (index == 2) {
                c3272Ze213.a = typedArray.getColorStateList(index);
            } else {
                if (index == 0) {
                    c3272Ze216.a = Integer.valueOf(typedArray.getDimensionPixelSize(index, i3));
                } else {
                    if (index == 5) {
                        int integer = typedArray.getInteger(index, i3);
                        if (integer > 0) {
                            c3272Ze2.a = a[integer - 1];
                        }
                    } else if (index == 25) {
                        i6 = typedArray.getInt(index, -1);
                        c3272Ze228.a = a(i6, i5);
                    } else {
                        if (index == 6) {
                            i5 = typedArray.getInt(index, -1);
                            c3272Ze228.a = a(i6, i5);
                            int i7 = i5 & 112;
                            c3272Ze226.a = i7 != 16 ? i7 != 48 ? i7 != 80 ? AbstractC9329rJ3.e : K84.BOTTOM : K84.TOP : K84.CENTER;
                        } else if (index == 15) {
                            c3272Ze23.a = Boolean.valueOf(typedArray.getBoolean(index, false));
                        } else if (index == 11) {
                            c3272Ze25.a = Integer.valueOf(typedArray.getInteger(index, -1));
                        } else if (index == 10) {
                            c3272Ze26.a = Integer.valueOf(typedArray.getInteger(index, -1));
                            i = indexCount;
                            i2 = 0;
                            i4++;
                            i3 = i2;
                            indexCount = i;
                            c3272Ze228 = c3272Ze217;
                        } else {
                            if (index == 14) {
                                i3 = 0;
                                c3272Ze211.a = Boolean.valueOf(typedArray.getBoolean(index, false));
                            } else {
                                i3 = 0;
                                if (index == 4) {
                                    c3272Ze214.a = Integer.valueOf(typedArray.getColor(index, 0));
                                } else if (index == 3) {
                                    c3272Ze215.a = Integer.valueOf(typedArray.getColor(index, 0));
                                } else if (index == 1) {
                                    c3272Ze221.a = Integer.valueOf(typedArray.getInteger(index, 0));
                                    i = indexCount;
                                    i2 = i3;
                                    i4++;
                                    i3 = i2;
                                    indexCount = i;
                                    c3272Ze228 = c3272Ze217;
                                } else if (index == 20) {
                                    c3272Ze22.a = Float.valueOf(typedArray.getDimensionPixelOffset(index, 0));
                                    i = indexCount;
                                    i2 = 0;
                                    i4++;
                                    i3 = i2;
                                    indexCount = i;
                                    c3272Ze228 = c3272Ze217;
                                } else if (index == 21) {
                                    c3272Ze24.a = Float.valueOf(typedArray.getFloat(index, 0.0f));
                                    i = indexCount;
                                    i2 = 0;
                                    i4++;
                                    i3 = i2;
                                    indexCount = i;
                                    c3272Ze228 = c3272Ze217;
                                } else {
                                    i = indexCount;
                                    if (index == 17) {
                                        c3272Ze223.a = Float.valueOf(typedArray.getFloat(index, 0.0f));
                                    } else if (index == 18) {
                                        c3272Ze224.a = Float.valueOf(typedArray.getFloat(index, 0.0f));
                                    } else if (index == 19) {
                                        c3272Ze222.a = Float.valueOf(typedArray.getFloat(index, 0.0f));
                                    } else if (index == 16) {
                                        c3272Ze225.a = Integer.valueOf(typedArray.getColor(index, 0));
                                    } else if (index == 13) {
                                        c3272Ze27.a = Integer.valueOf(typedArray.getInteger(index, -1));
                                    } else if (index == 12) {
                                        c3272Ze28.a = Integer.valueOf(typedArray.getInteger(index, -1));
                                    } else if (index == 8) {
                                        c3272Ze29.a = Integer.valueOf(typedArray.getDimensionPixelSize(index, 0));
                                    } else if (index == 7) {
                                        c3272Ze210.a = Integer.valueOf(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
                                    } else if (index == 24) {
                                        str = typedArray.getString(index);
                                    } else if (index == 26) {
                                        c3272Ze218.a = Integer.valueOf(typedArray.getInt(index, 0));
                                    } else if (index == 27) {
                                        c3272Ze219.a = Integer.valueOf(typedArray.getInt(index, 0));
                                    } else if (index == 28 && Build.VERSION.SDK_INT >= 26) {
                                        i2 = 0;
                                        c3272Ze220.a = Integer.valueOf(typedArray.getInt(index, 0));
                                        i4++;
                                        i3 = i2;
                                        indexCount = i;
                                        c3272Ze228 = c3272Ze217;
                                    }
                                    i2 = 0;
                                    i4++;
                                    i3 = i2;
                                    indexCount = i;
                                    c3272Ze228 = c3272Ze217;
                                }
                            }
                            i = indexCount;
                            i2 = i3;
                            i4++;
                            i3 = i2;
                            indexCount = i;
                            c3272Ze228 = c3272Ze217;
                        }
                        i = indexCount;
                        i2 = 0;
                        i4++;
                        i3 = i2;
                        indexCount = i;
                        c3272Ze228 = c3272Ze217;
                    }
                    i = indexCount;
                    i2 = i3;
                    i4++;
                    i3 = i2;
                    indexCount = i;
                    c3272Ze228 = c3272Ze217;
                }
                i = indexCount;
                i2 = i3;
                i4++;
                i3 = i2;
                indexCount = i;
                c3272Ze228 = c3272Ze217;
            }
            i = indexCount;
            i2 = i3;
            i4++;
            i3 = i2;
            indexCount = i;
            c3272Ze228 = c3272Ze217;
        }
        if (str != null) {
            Integer num = (Integer) c3272Ze221.a;
            c3272Ze227.a = Typeface.create(str, num == null ? -1 : num.intValue());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static UG3 a(int i, int i2) {
        UG3 ug3 = b;
        UG3 ug32 = UG3.LAYOUT_END;
        UG3 ug33 = UG3.LAYOUT_START;
        UG3 ug34 = UG3.CENTER;
        switch (i) {
            case 0:
            case 1:
                int i3 = 8388615 & i2;
                if (i3 != 1) {
                    if (i3 == 3) {
                        return UG3.LEFT;
                    }
                    if (i3 == 5) {
                        return UG3.RIGHT;
                    }
                    if (i3 != 8388611) {
                        if (i3 != 8388613) {
                            return ug3;
                        }
                        return ug32;
                    }
                    return ug33;
                }
                return ug34;
            case 2:
                return UG3.TEXT_START;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return UG3.TEXT_END;
            case 4:
                return ug34;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return ug33;
            case 6:
                return ug32;
            default:
                return ug3;
        }
    }
}
