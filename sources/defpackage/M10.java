package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M10 extends RuntimeException {
    public final List a;
    public final String g;
    public I10 h;

    public M10(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public M10(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof M10) {
                    linkedHashSet.addAll(((M10) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        this.g = unmodifiableList.size() + " exceptions occurred. ";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.g;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.h == null) {
            I10 i10 = new I10();
            HashSet hashSet = new HashSet();
            I10 i102 = i10;
            for (Throwable th : this.a) {
                if (!hashSet.contains(th)) {
                    hashSet.add(th);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = th.getCause();
                    if (cause != null && cause != th) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Throwable th2 = (Throwable) it.next();
                        if (hashSet.contains(th2)) {
                            th = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        i102.initCause(th);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = i102.getCause();
                    if (cause3 != null && i102 != cause3) {
                        do {
                            i102 = cause3;
                            cause3 = i102.getCause();
                            if (cause3 != null) {
                            }
                        } while (cause3 != i102);
                    }
                }
            }
            this.h = i10;
        }
        return this.h;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new K10(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new L10(printWriter));
    }

    public final void b(J10 j10) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        j10.a(sb.toString());
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }
}
