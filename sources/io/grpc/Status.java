package io.grpc;

import defpackage.AbstractC10711vL3;
import defpackage.AbstractC4172cJ;
import defpackage.C1873Ok3;
import defpackage.C9392rW1;
import defpackage.UY1;
import defpackage.V82;
import defpackage.VY1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Status {
    public static final Status OK;
    public static final List d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public final Code a;
    public final String b;
    public final Throwable c;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public enum Code {
        g("OK"),
        h("CANCELLED"),
        i("UNKNOWN"),
        j("INVALID_ARGUMENT"),
        k("DEADLINE_EXCEEDED"),
        l("NOT_FOUND"),
        m("ALREADY_EXISTS"),
        n("PERMISSION_DENIED"),
        o("RESOURCE_EXHAUSTED"),
        p("FAILED_PRECONDITION"),
        q("ABORTED"),
        r("OUT_OF_RANGE"),
        s("UNIMPLEMENTED"),
        t("INTERNAL"),
        u("UNAVAILABLE"),
        v("DATA_LOSS"),
        w("UNAUTHENTICATED");

        public final int a;

        public final Status a() {
            return (Status) Status.d.get(this.a);
        }

        Code(String str) {
            this.a = r2;
            Integer.toString(r2).getBytes(AbstractC4172cJ.a);
        }

        public int value() {
            return this.a;
        }
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        OK = Code.g.a();
        Code.h.a();
        e = Code.i.a();
        Code.j.a();
        Code.k.a();
        Code.l.a();
        Code.m.a();
        Code.n.a();
        Code.w.a();
        Code.o.a();
        f = Code.p.a();
        g = Code.q.a();
        Code.r.a();
        Code.s.a();
        Code.t.a();
        Code.u.a();
        Code.v.a();
        new C9392rW1("grpc-status");
        new C1873Ok3();
        new C9392rW1("grpc-message");
    }

    public static Status fromCodeValue(int i) {
        if (i >= 0) {
            List list = d;
            if (i <= list.size()) {
                return (Status) list.get(i);
            }
        }
        return e.withDescription("Unknown code " + i);
    }

    public static String a(Status status) {
        String str = status.b;
        Code code = status.a;
        if (str == null) {
            return code.toString();
        }
        return code + ": " + status.b;
    }

    public Status(Code code, String str, Throwable th) {
        this.a = code;
        this.b = str;
        this.c = th;
    }

    public Status withDescription(String str) {
        return V82.a(this.b, str) ? this : new Status(this.a, str, this.c);
    }

    public Code getCode() {
        return this.a;
    }

    public String getDescription() {
        return this.b;
    }

    public final boolean b() {
        return Code.g == this.a;
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final String toString() {
        UY1 a = VY1.a(this);
        a.a(this.a.name(), "code");
        a.a(this.b, "description");
        Throwable th = this.c;
        Object obj = th;
        if (th != null) {
            Object obj2 = AbstractC10711vL3.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        a.a(obj, "cause");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
