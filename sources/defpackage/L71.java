package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ImageSpan;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L71 extends AbstractC1810Ny0 {
    public final float a;
    public final RectF b;
    public final Paint c;
    public final AbstractC9896sy0 d;
    public Path e;

    public static float[] g(float f) {
        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    public static float[] h(float f) {
        return new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void a(Canvas canvas) {
    }

    public L71(int i, float f, RectF rectF, AbstractC9896sy0 abstractC9896sy0) {
        this.a = f;
        this.b = rectF;
        Paint paint = new Paint();
        this.c = paint;
        this.d = abstractC9896sy0;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void b(Canvas canvas) {
        Path path = this.e;
        if (path != null) {
            canvas.drawPath(path, this.c);
        }
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void f() {
        this.e = null;
    }

    @Override // defpackage.AbstractC1810Ny0
    public final void d(Layout layout, CharSequence charSequence) {
        Path path;
        Path path2;
        float[] h;
        float[] g;
        boolean z;
        Layout layout2 = layout;
        if (layout.getLineCount() != 0) {
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int i = 1;
                int lineEnd = layout2.getLineEnd(layout.getLineCount() - 1);
                int spanStart = spanned.getSpanStart(this);
                if (spanStart != -1 && spanStart < lineEnd) {
                    int spanEnd = spanned.getSpanEnd(this);
                    if (spanEnd == -1) {
                        spanEnd = lineEnd;
                    }
                    int lineForOffset = layout2.getLineForOffset(spanStart);
                    int min = Math.min(layout.getLineCount() - 1, layout2.getLineForOffset(spanEnd));
                    boolean isRtlCharAt = layout2.isRtlCharAt(spanStart);
                    Path path3 = new Path();
                    int i2 = lineForOffset;
                    while (i2 <= min) {
                        try {
                            try {
                                RectF rectF = new RectF(layout2.getLineLeft(i2), layout2.getLineTop(i2) + 1, layout2.getLineRight(i2), layout2.getLineBottom(i2) - ((i2 == layout.getLineCount() - i ? i : 0) != 0 ? 0.0f : layout.getSpacingAdd()));
                                float[] fArr = new float[3];
                                fArr[0] = rectF.height() / 2.0f;
                                try {
                                    fArr[1] = rectF.width() / 2.0f;
                                    fArr[2] = this.a;
                                    float f = fArr[0];
                                    int i3 = 1;
                                    for (int i4 = 3; i3 < i4; i4 = 3) {
                                        f = Math.min(f, fArr[i3]);
                                        i3++;
                                    }
                                    if (i2 == lineForOffset) {
                                        float primaryHorizontal = layout2.getPrimaryHorizontal(spanStart);
                                        if (isRtlCharAt) {
                                            rectF.right = primaryHorizontal;
                                        } else {
                                            rectF.left = primaryHorizontal;
                                        }
                                    }
                                    if (i2 == min && spanEnd < layout2.getLineEnd(min)) {
                                        int length = spanned.length();
                                        if (length != 0) {
                                            int i5 = length - 1;
                                            for (C6995kX3 c6995kX3 : (C6995kX3[]) spanned.getSpans(i5, i5, C6995kX3.class)) {
                                                if (spanEnd >= spanned.getSpanStart(c6995kX3)) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (!z) {
                                            float primaryHorizontal2 = layout2.getPrimaryHorizontal(spanEnd);
                                            if (isRtlCharAt) {
                                                rectF.left = primaryHorizontal2;
                                            } else {
                                                rectF.right = primaryHorizontal2;
                                            }
                                        }
                                    }
                                    RectF rectF2 = new RectF();
                                    RectF rectF3 = this.b;
                                    if (rectF3 == null) {
                                        float f2 = i2 == lineForOffset ? f : 0.0f;
                                        rectF2.left = f2;
                                        rectF2.top = 0.0f;
                                        float f3 = i2 == min ? f : 0.0f;
                                        rectF2.right = f3;
                                        rectF2.bottom = 0.0f;
                                        if (isRtlCharAt) {
                                            rectF2.left = f3;
                                            rectF2.right = f2;
                                        }
                                    } else {
                                        rectF2 = rectF3;
                                    }
                                    rectF.set(rectF.left - rectF2.left, rectF.top - rectF2.top, rectF.right + rectF2.right, rectF.bottom + rectF2.bottom);
                                    if (i2 == lineForOffset && lineForOffset == min) {
                                        float[] fArr2 = new float[8];
                                        fArr2[0] = f;
                                        try {
                                            fArr2[1] = f;
                                            fArr2[2] = f;
                                            fArr2[3] = f;
                                            fArr2[4] = f;
                                            fArr2[5] = f;
                                            fArr2[6] = f;
                                            fArr2[7] = f;
                                            path3.addRoundRect(rectF, fArr2, Path.Direction.CW);
                                        } catch (IndexOutOfBoundsException e) {
                                            e = e;
                                            path2 = path3;
                                            this.d.b(EnumC11438xU.A, "IOOBDiagnostics: line:" + i2 + " tl:" + spanned.length() + " lc:" + layout.getLineCount() + " so:" + spanStart + " eo:" + spanEnd + " fl:" + lineForOffset + " ll:" + min + " rtl:" + isRtlCharAt + " sp:" + spanned.getSpans(0, spanned.length(), Object.class).length + " isp:" + ((ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class)).length + " esp:" + ((AbstractC1810Ny0[]) spanned.getSpans(0, spanned.length(), AbstractC1810Ny0.class)).length, e);
                                            i2++;
                                            layout2 = layout;
                                            path3 = path2;
                                            i = 1;
                                        }
                                    } else if (i2 == lineForOffset) {
                                        if (isRtlCharAt) {
                                            g = h(f);
                                        } else {
                                            g = g(f);
                                        }
                                        path3.addRoundRect(rectF, g, Path.Direction.CW);
                                    } else if (i2 == min) {
                                        if (isRtlCharAt) {
                                            h = g(f);
                                        } else {
                                            h = h(f);
                                        }
                                        path3.addRoundRect(rectF, h, Path.Direction.CW);
                                    } else {
                                        path3.addRect(rectF, Path.Direction.CW);
                                    }
                                    path2 = path3;
                                } catch (IndexOutOfBoundsException e2) {
                                    e = e2;
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                        i2++;
                        layout2 = layout;
                        path3 = path2;
                        i = 1;
                    }
                    path = path3;
                    this.e = path;
                }
            }
        }
        path = null;
        this.e = path;
    }
}
