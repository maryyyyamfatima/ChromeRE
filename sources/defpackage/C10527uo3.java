package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uo3 */
/* loaded from: classes2.dex */
public final class C10527uo3 {
    public final Context a;
    public WebContents b;
    public C2469Ta c;
    public C0201Bo0 d;
    public C0851Go0 e;

    public C10527uo3(Context context) {
        this.a = context;
    }

    public final InterfaceC10184to3 a() {
        Context context = this.a;
        if (AbstractC10524uo0.a(context)) {
            if (this.d == null) {
                this.d = new C0201Bo0();
            }
            return this.d;
        }
        boolean z = false;
        if (AbstractC6205iD.a() && Settings.Global.getInt(context.getContentResolver(), "stylus_handwriting_enabled", -1) == 1) {
            List<InputMethodInfo> inputMethodList = ((InputMethodManager) context.getSystemService(InputMethodManager.class)).getInputMethodList();
            String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
            Iterator<InputMethodInfo> it = inputMethodList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InputMethodInfo next = it.next();
                if (next.getComponent().flattenToString().equals(string)) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    try {
                        atomicBoolean.set(((Boolean) next.getClass().getMethod("supportsStylusHandwriting", new Class[0]).invoke(next, new Object[0])).booleanValue());
                        atomicBoolean.get();
                        z = atomicBoolean.get();
                        break;
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException("Reflection failed in AndroidStylusWritingHandler", e);
                    }
                }
            }
        }
        if (z) {
            if (this.c == null) {
                this.c = new C2469Ta(context);
            }
            return this.c;
        }
        if (this.e == null) {
            this.e = new C0851Go0();
        }
        return this.e;
    }

    public final void b(WebContents webContents) {
        if (webContents.C() == null) {
            return;
        }
        this.b = webContents;
        InterfaceC10184to3 a = a();
        a.g(this.a, webContents);
        webContents.C().f = a.e();
    }
}
