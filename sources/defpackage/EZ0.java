package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EZ0 extends Exception {
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public final List a;
    public InterfaceC6098hu1 g;
    public EnumC9447rg0 h;
    public Class i;
    public final String j;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public EZ0(String str) {
        this(str, Collections.emptyList());
    }

    public EZ0(String str, List list) {
        this.j = str;
        setStackTrace(k);
        this.a = list;
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Log.i("Glide", "Root cause (" + i2 + " of " + size + ")", (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof EZ0) {
            Iterator it = ((EZ0) th).a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.a, new DZ0(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.j);
        Class cls = this.i;
        sb.append(cls != null ? ", ".concat(String.valueOf(cls)) : "");
        EnumC9447rg0 enumC9447rg0 = this.h;
        sb.append(enumC9447rg0 != null ? ", ".concat(String.valueOf(enumC9447rg0)) : "");
        InterfaceC6098hu1 interfaceC6098hu1 = this.g;
        sb.append(interfaceC6098hu1 != null ? ", ".concat(String.valueOf(interfaceC6098hu1)) : "");
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public static void b(List list, DZ0 dz0) {
        try {
            c(list, dz0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List list, DZ0 dz0) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            dz0.append("Cause (");
            int i2 = i + 1;
            dz0.append(String.valueOf(i2));
            dz0.append(" of ");
            dz0.append(String.valueOf(size));
            dz0.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof EZ0) {
                ((EZ0) th).f(dz0);
            } else {
                d(th, dz0);
            }
            i = i2;
        }
    }
}
