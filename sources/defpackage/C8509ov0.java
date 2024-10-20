package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ov0 */
/* loaded from: classes.dex */
public final class C8509ov0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public static void a(int i, C10223tv0 c10223tv0, View view) {
        switch (i) {
            case 1:
                view.setAlpha(((Float) c10223tv0.a).floatValue());
                return;
            case 2:
                view.setTranslationX(((Float) c10223tv0.a).floatValue());
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                view.setTranslationY(((Float) c10223tv0.a).floatValue());
                return;
            case 4:
                view.setScaleX(((Float) c10223tv0.a).floatValue());
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                view.setScaleY(((Float) c10223tv0.a).floatValue());
                return;
            case 6:
                view.setElevation(((Float) c10223tv0.a).floatValue());
                return;
            case 7:
                view.setBackgroundColor(((Integer) c10223tv0.a).intValue());
                return;
            case 8:
                view.setRotation(((Float) c10223tv0.a).floatValue());
                return;
            case 9:
                view.setBackground((Drawable) c10223tv0.a);
                return;
            default:
                return;
        }
    }

    public final void b(WZ wz, Object obj) {
        boolean z = wz.e0() && WZ.i0(wz);
        boolean z2 = WZ.C.length > 0;
        if (z || z2) {
            HashSet hashSet = new HashSet();
            if (z) {
                SparseArray Y = wz.Y();
                for (int i = 0; i < Y.size(); i++) {
                    int keyAt = Y.keyAt(i);
                    C10223tv0 c10223tv0 = (C10223tv0) Y.valueAt(i);
                    a(keyAt, c10223tv0, (View) obj);
                    HashMap hashMap = this.a;
                    Set set = (Set) hashMap.get(c10223tv0);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(c10223tv0, set);
                        c10223tv0.b.add(this);
                    }
                    set.add(wz);
                    hashSet.add(c10223tv0);
                }
            }
            C10223tv0[] c10223tv0Arr = WZ.C;
            if (c10223tv0Arr.length > 0) {
                Object obj2 = c10223tv0Arr[0].a;
                throw new RuntimeException("Components that have dynamic Props must override this method");
            }
            this.b.put(wz, hashSet);
            this.c.put(wz, obj);
        }
    }

    public final void c(WZ wz, Object obj) {
        if ((wz.e0() && WZ.i0(wz)) || WZ.C.length != 0) {
            this.c.remove(wz);
            Set<C10223tv0> set = (Set) this.b.get(wz);
            if (set == null) {
                return;
            }
            for (C10223tv0 c10223tv0 : set) {
                HashMap hashMap = this.a;
                Set set2 = (Set) hashMap.get(c10223tv0);
                set2.remove(wz);
                if (set2.isEmpty()) {
                    hashMap.remove(c10223tv0);
                    c10223tv0.b.remove(this);
                }
            }
            if (obj instanceof View) {
                View view = (View) obj;
                if (view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                if (view.getTranslationX() != 0.0f) {
                    view.setTranslationX(0.0f);
                }
                if (view.getTranslationY() != 0.0f) {
                    view.setTranslationY(0.0f);
                }
                if (view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
                if (view.getElevation() != 0.0f) {
                    view.setElevation(0.0f);
                }
                if (view.getBackground() != null) {
                    view.setBackground(null);
                }
                if (view.getRotation() != 0.0f) {
                    view.setRotation(0.0f);
                }
            }
        }
    }
}
