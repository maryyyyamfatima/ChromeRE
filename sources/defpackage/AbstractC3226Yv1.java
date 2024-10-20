package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3226Yv1 {
    public static void b(Context context, ActionMode actionMode) {
        boolean z;
        int i;
        String packageName = context.getPackageName();
        int c = AbstractC4983eg2.c(context, packageName);
        if (c != -1 && (i = context.getApplicationInfo().targetSdkVersion) >= 23 && i <= 24 && "com.lge.email".equals(packageName) && c <= 67502100) {
            AbstractC4851eH1.f("Ime", AbstractC9076qb1.a("Working around action mode LG Email bug in WebView (http://crbug.com/651706). APK name: com.lge.email, versionCode: ", c), new Object[0]);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C2836Vv1 c2836Vv1 = new C2836Vv1((ActionMode.Callback2) a(actionMode, "mCallback"));
                Field declaredField = actionMode.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                declaredField.set(actionMode, c2836Vv1);
                Object a = a(actionMode, "mFloatingToolbar");
                Object a2 = a(a, "mPopup");
                ViewGroup viewGroup = (ViewGroup) a(a2, "mContentContainer");
                PopupWindow popupWindow = (PopupWindow) a(a2, "mPopupWindow");
                Method declaredMethod = a.getClass().getDeclaredMethod("createExitAnimation", View.class, Integer.TYPE, Animator.AnimatorListener.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, viewGroup, 150, new C3096Xv1(popupWindow, viewGroup));
                Field declaredField2 = a2.getClass().getDeclaredField("mDismissAnimation");
                declaredField2.setAccessible(true);
                declaredField2.set(a2, invoke);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            } catch (Exception e) {
                AbstractC4851eH1.f("Ime", "Error occurred during LGEmailActionModeWorkaround: ", e);
            }
        }
    }

    public static Object a(Object obj, String str) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
