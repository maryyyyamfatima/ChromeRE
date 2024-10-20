package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IH3 extends Drawable implements KT3, TextContent, Drawable.Callback {
    public static final Point[] B = {new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24)};
    public C2200Qy0 A;
    public Layout a;
    public float g;
    public boolean h;
    public boolean i;
    public CharSequence j;
    public ColorStateList k;
    public int l;
    public int m;
    public ClickableSpan[] n;
    public ImageSpan[] o;
    public int p;
    public int q;
    public Path r;
    public Path s;
    public boolean t;
    public Paint u;
    public float v;
    public boolean w;
    public Handler x;
    public HH3 y;
    public String z;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final boolean h(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        boolean z;
        if (this.a == null) {
            return;
        }
        int save = canvas.save();
        Rect bounds = getBounds();
        if (this.h) {
            canvas.clipRect(bounds);
        }
        canvas.translate(bounds.left, bounds.top + this.g);
        C2200Qy0 c2200Qy0 = this.A;
        int i2 = 0;
        if (c2200Qy0 != null) {
            AbstractC1810Ny0[] abstractC1810Ny0Arr = c2200Qy0.a;
            if (abstractC1810Ny0Arr != null) {
                for (AbstractC1810Ny0 abstractC1810Ny0 : abstractC1810Ny0Arr) {
                    if (abstractC1810Ny0.e()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            i = z ? canvas.saveLayer(new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()), null) : 0;
            AbstractC1810Ny0[] abstractC1810Ny0Arr2 = this.A.a;
            if (abstractC1810Ny0Arr2 != null) {
                for (AbstractC1810Ny0 abstractC1810Ny02 : abstractC1810Ny0Arr2) {
                    abstractC1810Ny02.b(canvas);
                }
            }
        } else {
            i = 0;
        }
        try {
            this.a.draw(canvas, d(), this.u, 0);
            C2200Qy0 c2200Qy02 = this.A;
            if (c2200Qy02 != null) {
                AbstractC1810Ny0[] abstractC1810Ny0Arr3 = c2200Qy02.a;
                if (abstractC1810Ny0Arr3 != null) {
                    for (AbstractC1810Ny0 abstractC1810Ny03 : abstractC1810Ny0Arr3) {
                        abstractC1810Ny03.a(canvas);
                    }
                }
                AbstractC1810Ny0[] abstractC1810Ny0Arr4 = this.A.a;
                if (abstractC1810Ny0Arr4 != null) {
                    int length = abstractC1810Ny0Arr4.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (abstractC1810Ny0Arr4[i3].e()) {
                            i2 = 1;
                            break;
                        }
                        i3++;
                    }
                }
                if (i2 != 0) {
                    canvas.restoreToCount(i);
                }
            }
            canvas.restoreToCount(save);
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(" [");
            sb.append(this.z);
            sb.append("] ");
            CharSequence charSequence = this.j;
            if (charSequence instanceof SpannableStringBuilder) {
                Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                sb.append("spans: ");
                int length2 = spans.length;
                while (i2 < length2) {
                    sb.append(spans[i2].getClass().getSimpleName());
                    sb.append(", ");
                    i2++;
                }
            }
            sb.append("ellipsizedWidth: ");
            sb.append(this.a.getEllipsizedWidth());
            sb.append(", lineCount: ");
            sb.append(this.a.getLineCount());
            throw new IndexOutOfBoundsException(AbstractC7848n0.a(message, sb.toString()));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.k != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.k != null && (layout = this.a) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.k.getColorForState(iArr, this.l);
            if (colorForState != color) {
                this.a.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            if (((!r17.i || r17.x == null || r19.getAction() == 0) ? false : true) != false) goto L409;     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a3  */
    @Override // defpackage.KT3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.View r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IH3.b(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void f() {
        Handler handler = this.x;
        if (handler != null) {
            handler.removeCallbacks(this.y);
            this.y = null;
        }
        this.w = false;
    }

    @Override // defpackage.KT3
    public final boolean a(MotionEvent motionEvent) {
        if (i(motionEvent)) {
            return true;
        }
        return (this.i && this.x != null && motionEvent.getAction() != 0) || h(motionEvent);
    }

    public final boolean i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (this.i && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (actionMasked == 1 || actionMasked == 0)) || actionMasked == 3;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        CharSequence charSequence = this.j;
        return charSequence != null ? Collections.singletonList(charSequence) : Collections.emptyList();
    }

    public final ClickableSpan c(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        int e = e(i, i2);
        if (e >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.j).getSpans(e, e, ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    public final int e(int i, int i2) {
        float paragraphRight;
        float f;
        int lineForVertical = this.a.getLineForVertical(i2);
        if (this.a.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            f = this.a.getLineLeft(lineForVertical);
            paragraphRight = this.a.getLineRight(lineForVertical);
        } else {
            boolean z = this.a.getParagraphDirection(lineForVertical) == -1;
            Layout layout = this.a;
            float width = z ? layout.getWidth() - this.a.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
            paragraphRight = z ? this.a.getParagraphRight(lineForVertical) : this.a.getLineMax(lineForVertical);
            f = width;
        }
        float f2 = i;
        if (f2 >= f && f2 <= paragraphRight) {
            try {
                return this.a.getOffsetForHorizontal(lineForVertical, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public final Path d() {
        if (this.p == this.q || Color.alpha(this.m) == 0) {
            return null;
        }
        if (this.t) {
            if (this.r == null) {
                this.r = new Path();
            }
            this.a.getSelectionPath(this.p, this.q, this.r);
            this.t = false;
        }
        return this.r;
    }

    public final void g(int i, int i2) {
        if (Color.alpha(this.m) != 0) {
            if (this.p == i && this.q == i2) {
                return;
            }
            this.p = i;
            this.q = i2;
            Paint paint = this.u;
            if (paint == null) {
                Paint paint2 = new Paint();
                this.u = paint2;
                paint2.setColor(this.m);
            } else {
                paint.setColor(this.m);
            }
            this.t = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
