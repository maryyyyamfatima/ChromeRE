package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9146qn extends AbstractC3215Yt0 {
    public boolean g;

    public C9146qn(Drawable drawable) {
        super(drawable);
        a(this, new Callback() { // from class: hn
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Animatable animatable = (Animatable) obj;
                if (animatable instanceof InterfaceC4950eb) {
                    ((InterfaceC4950eb) animatable).a(AbstractC8803pn.a);
                } else if (animatable instanceof Animatable2) {
                    ((Animatable2) animatable).registerAnimationCallback(AbstractC8460on.a);
                }
            }
        });
    }

    @Override // defpackage.AbstractC3215Yt0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (visible || z2 || !this.g) {
                a(this, new Callback() { // from class: jn
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        ((Animatable) obj).start();
                    }
                });
            }
        } else {
            a(this, new Callback() { // from class: in
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ((Animatable) obj).stop();
                }
            });
        }
        this.g = true;
        return visible;
    }

    public static Drawable b(Drawable drawable) {
        if (drawable != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            a(drawable, new Callback() { // from class: kn
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    atomicBoolean.set(true);
                }
            });
            if (atomicBoolean.get()) {
                return new C9146qn(drawable);
            }
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, Callback callback) {
        if (drawable == 0) {
            return;
        }
        if (drawable instanceof Animatable) {
            callback.onResult((Animatable) drawable);
            return;
        }
        if (drawable != drawable.getCurrent()) {
            a(drawable.getCurrent(), callback);
        }
        if (drawable instanceof DrawableWrapper) {
            a(((DrawableWrapper) drawable).getDrawable(), callback);
            return;
        }
        if (drawable instanceof AbstractC3215Yt0) {
            a(((AbstractC3215Yt0) drawable).a, callback);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                a(layerDrawable.getDrawable(i), callback);
            }
            return;
        }
        if (drawable instanceof InsetDrawable) {
            a(((InsetDrawable) drawable).getDrawable(), callback);
        } else if (drawable instanceof RotateDrawable) {
            a(((RotateDrawable) drawable).getDrawable(), callback);
        } else if (drawable instanceof ScaleDrawable) {
            a(((ScaleDrawable) drawable).getDrawable(), callback);
        }
    }
}
