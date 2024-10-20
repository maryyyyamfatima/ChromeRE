package defpackage;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0790Gc {
    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        PropertyValuesHolder ofInt;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && d(i7)) || (z2 && d(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C2667Un2[] c = AbstractC2927Wn2.c(string);
            C2667Un2[] c2 = AbstractC2927Wn2.c(string2);
            if (c == null && c2 == null) {
                return null;
            }
            if (c == null) {
                if (c2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C0660Fc(), c2);
                }
                return null;
            }
            C0660Fc c0660Fc = new C0660Fc();
            if (c2 != null) {
                if (!AbstractC2927Wn2.a(c, c2)) {
                    throw new InflateException(IR0.a(" Can't morph from ", string, " to ", string2));
                }
                ofObject = PropertyValuesHolder.ofObject(str, c0660Fc, c, c2);
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, c0660Fc, c);
            }
            return ofObject;
        }
        C1864Oj c1864Oj = i == 3 ? C1864Oj.a : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else {
            if (!z) {
                if (z2) {
                    if (i8 == 5) {
                        i4 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (d(i8)) {
                        i4 = typedArray.getColor(i3, 0);
                    } else {
                        i4 = typedArray.getInt(i3, 0);
                    }
                    ofInt = PropertyValuesHolder.ofInt(str, i4);
                }
                if (propertyValuesHolder == null && c1864Oj != null) {
                    propertyValuesHolder.setEvaluator(c1864Oj);
                    return propertyValuesHolder;
                }
            }
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (d(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (d(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x034c, code lost:            r1 = new android.animation.Animator[r13.size()];        r2 = r13.iterator();        r14 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x035b, code lost:            if (r2.hasNext() == false) goto L190;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x035d, code lost:            r1[r14] = (android.animation.Animator) r2.next();        r14 = r14 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0369, code lost:            if (r33 != 0) goto L180;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x036b, code lost:            r32.playTogether(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x036f, code lost:            r32.playSequentially(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0372, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0348, code lost:            if (r32 == null) goto L181;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x034a, code lost:            if (r13 == null) goto L181;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0790Gc.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray h = AbstractC9067qZ3.h(resources, theme, attributeSet, AbstractC1949Pa.g);
        TypedArray h2 = AbstractC9067qZ3.h(resources, theme, attributeSet, AbstractC1949Pa.k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long d = AbstractC9067qZ3.d(h, xmlResourceParser, "duration", 1, 300);
        int i = 0;
        long d2 = AbstractC9067qZ3.d(h, xmlResourceParser, "startOffset", 2, 0);
        int d3 = AbstractC9067qZ3.d(h, xmlResourceParser, "valueType", 7, 4);
        if (AbstractC9067qZ3.g("valueFrom", xmlResourceParser) && AbstractC9067qZ3.g("valueTo", xmlResourceParser)) {
            if (d3 == 4) {
                TypedValue peekValue = h.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = h.peekValue(6);
                boolean z2 = peekValue2 != null;
                d3 = ((z && d(i2)) || (z2 && d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c = c(h, d3, 5, 6, "");
            if (c != null) {
                valueAnimator3.setValues(c);
            }
        }
        valueAnimator3.setDuration(d);
        valueAnimator3.setStartDelay(d2);
        valueAnimator3.setRepeatCount(AbstractC9067qZ3.d(h, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(AbstractC9067qZ3.d(h, xmlResourceParser, "repeatMode", 4, 1));
        if (h2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String e = AbstractC9067qZ3.e(h2, xmlResourceParser, "pathData", 1);
            if (e != null) {
                String e2 = AbstractC9067qZ3.e(h2, xmlResourceParser, "propertyXName", 2);
                String e3 = AbstractC9067qZ3.e(h2, xmlResourceParser, "propertyYName", 3);
                if (e2 == null && e3 == null) {
                    throw new InflateException(h2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d4 = AbstractC2927Wn2.d(e);
                PathMeasure pathMeasure = new PathMeasure(d4, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d4, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = h;
                int i3 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int i4 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f3 += f2;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f3 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    min = i4;
                }
                PropertyValuesHolder ofFloat = e2 != null ? PropertyValuesHolder.ofFloat(e2, fArr) : null;
                PropertyValuesHolder ofFloat2 = e3 != null ? PropertyValuesHolder.ofFloat(e3, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = h;
                objectAnimator2.setPropertyName(AbstractC9067qZ3.e(h2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = h;
        }
        if (AbstractC9067qZ3.g("interpolator", xmlResourceParser)) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
            if (loadInterpolator == null) {
                throw new NullPointerException("Failed to parse interpolator, no start tag found");
            }
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(loadInterpolator);
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (h2 != null) {
            h2.recycle();
        }
        return valueAnimator2;
    }
}
