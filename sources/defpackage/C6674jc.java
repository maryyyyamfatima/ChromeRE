package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6674jc extends AbstractC8588p84 implements InterfaceC4950eb {
    public final C5988hc g;
    public final Context h;
    public C5644gc i = null;
    public ArrayList j = null;
    public final C5300fc k;

    public C6674jc(Context context) {
        C5300fc c5300fc = new C5300fc(this);
        this.k = c5300fc;
        this.h = context;
        this.g = new C5988hc(c5300fc);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public static C6674jc b(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C6674jc c6674jc = new C6674jc(context);
            Resources resources = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = GP2.a;
            Drawable drawable = resources.getDrawable(i, theme);
            drawable.setCallback(c6674jc.k);
            new C6332ic(drawable.getConstantState());
            c6674jc.a = drawable;
            return c6674jc;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            Resources resources2 = context.getResources();
            Resources.Theme theme2 = context.getTheme();
            C6674jc c6674jc2 = new C6674jc(context);
            c6674jc2.inflate(resources2, xml, asAttributeSet, theme2);
            return c6674jc2;
        } catch (IOException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C6332ic(this.a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.g.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C5988hc c5988hc = this.g;
        c5988hc.a.draw(canvas);
        if (c5988hc.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.g.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.g.a.setState(iArr);
    }

    @Override // defpackage.AbstractC8588p84, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.g.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.g.a.getAlpha();
        }
        return drawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.g.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.g.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.g.a.getColorFilter();
        }
        return drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC0486Dt0.a(drawable, i);
        } else {
            this.g.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC0486Dt0.b(drawable, colorStateList);
        } else {
            this.g.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC0486Dt0.c(drawable, mode);
        } else {
            this.g.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.g.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.g.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.g.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.g.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.g.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return this.g.a.isAutoMirrored();
        }
        return drawable.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.g.a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C5988hc c5988hc;
        String str;
        Animator animator;
        Drawable drawable = this.a;
        if (drawable == null) {
            int eventType = xmlPullParser.getEventType();
            int i = 1;
            int depth = xmlPullParser.getDepth() + 1;
            while (true) {
                c5988hc = this.g;
                if (eventType == i || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                    break;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    XmlResourceParser xmlResourceParser = null;
                    if ("animated-vector".equals(name)) {
                        TypedArray h = AbstractC9067qZ3.h(resources, theme, attributeSet, AbstractC1949Pa.e);
                        int resourceId = h.getResourceId(0, 0);
                        if (resourceId != 0) {
                            C11674y84 b = C11674y84.b(resources, resourceId, theme);
                            if (b == null) {
                                throw new NullPointerException("Failed to load drawable");
                            }
                            b.k = false;
                            b.setCallback(this.k);
                            C11674y84 c11674y84 = c5988hc.a;
                            if (c11674y84 != null) {
                                c11674y84.setCallback(null);
                            }
                            c5988hc.a = b;
                        }
                        h.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1949Pa.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(i, 0);
                        if (resourceId2 != 0) {
                            Context context = this.h;
                            if (context != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    animator = AnimatorInflater.loadAnimator(context, resourceId2);
                                } else {
                                    Resources resources2 = context.getResources();
                                    Resources.Theme theme2 = context.getTheme();
                                    try {
                                        try {
                                            XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                            str = "Can't load animation resource ID #0x";
                                            try {
                                                Animator a = AbstractC0790Gc.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                                animation.close();
                                                animator = a;
                                            } catch (IOException e) {
                                                e = e;
                                                Resources.NotFoundException notFoundException = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                                notFoundException.initCause(e);
                                                throw notFoundException;
                                            } catch (XmlPullParserException e2) {
                                                e = e2;
                                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                                notFoundException2.initCause(e);
                                                throw notFoundException2;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            str = "Can't load animation resource ID #0x";
                                        } catch (XmlPullParserException e4) {
                                            e = e4;
                                            str = "Can't load animation resource ID #0x";
                                        }
                                    } catch (Throwable th) {
                                        if (0 != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                }
                                animator.setTarget(c5988hc.a.g.b.o.get(string));
                                if (c5988hc.c == null) {
                                    c5988hc.c = new ArrayList();
                                    c5988hc.d = new C4317ck();
                                }
                                c5988hc.c.add(animator);
                                c5988hc.d.put(animator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
                i = 1;
            }
            if (c5988hc.b == null) {
                c5988hc.b = new AnimatorSet();
            }
            c5988hc.b.playTogether(c5988hc.c);
            return;
        }
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // defpackage.AbstractC8588p84, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.g.b.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C5988hc c5988hc = this.g;
        if (c5988hc.b.isStarted()) {
            return;
        }
        c5988hc.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.g.b.end();
        }
    }

    @Override // defpackage.InterfaceC4950eb
    public final void a(AbstractC4607db abstractC4607db) {
        if (abstractC4607db == null) {
            return;
        }
        Drawable drawable = this.a;
        if (drawable == null) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            if (this.j.contains(abstractC4607db)) {
                return;
            }
            this.j.add(abstractC4607db);
            if (this.i == null) {
                this.i = new C5644gc(this);
            }
            this.g.b.addListener(this.i);
            return;
        }
        ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC4607db.a());
    }

    public final boolean e(AbstractC4607db abstractC4607db) {
        C5644gc c5644gc;
        if (abstractC4607db == null) {
            return false;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC4607db.a());
        }
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        boolean remove = arrayList.remove(abstractC4607db);
        if (this.j.size() == 0 && (c5644gc = this.i) != null) {
            this.g.b.removeListener(c5644gc);
            this.i = null;
        }
        return remove;
    }

    public static void c(Drawable drawable, AbstractC4607db abstractC4607db) {
        if (drawable == null || abstractC4607db == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 24) {
            ((C6674jc) drawable).a(abstractC4607db);
        } else {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC4607db.a());
        }
    }

    public static void d(Drawable drawable, AbstractC4607db abstractC4607db) {
        if (drawable == null || abstractC4607db == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 24) {
            ((C6674jc) drawable).e(abstractC4607db);
        } else {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC4607db.a());
        }
    }
}
