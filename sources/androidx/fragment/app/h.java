package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC2633Ug3;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC7848n0;
import defpackage.C0143Bc2;
import defpackage.C10547us;
import defpackage.C11434xT0;
import defpackage.C11491xd4;
import defpackage.C3536aT0;
import defpackage.C5099f00;
import defpackage.C5598gT0;
import defpackage.C5942hT0;
import defpackage.C6286iT0;
import defpackage.C6628jT0;
import defpackage.C6972kT0;
import defpackage.C7660mT0;
import defpackage.C8004nT0;
import defpackage.C8348oT0;
import defpackage.C8691pT0;
import defpackage.C9376rT0;
import defpackage.C9719sT0;
import defpackage.C9731sV2;
import defpackage.EnumC11683yA1;
import defpackage.InterfaceC0273Cc2;
import defpackage.InterfaceC10062tT0;
import defpackage.InterfaceC10405uT0;
import defpackage.InterfaceC10417uV2;
import defpackage.InterfaceC11777yT0;
import defpackage.InterfaceC11989z40;
import defpackage.InterfaceC12177zd4;
import defpackage.InterfaceC1832Oc2;
import defpackage.InterfaceC4103c6;
import defpackage.InterfaceC4965ed2;
import defpackage.InterfaceC5309fd2;
import defpackage.InterfaceC8059nd2;
import defpackage.InterfaceC9388rV2;
import defpackage.LF;
import defpackage.LayoutInflaterFactory2C4910eT0;
import defpackage.NS0;
import defpackage.NT0;
import defpackage.RT0;
import defpackage.RunnableC9034qT0;
import defpackage.TT0;
import defpackage.US0;
import defpackage.V5;
import defpackage.W5;
import defpackage.Y5;
import defpackage.YH1;
import defpackage.YS1;
import defpackage.Z5;
import defpackage.ZS0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.chrome.browser.sync.ui.PassphraseActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class h {
    public Z5 A;
    public Z5 B;
    public Z5 C;
    public ArrayDeque D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public ArrayList f11485J;
    public ArrayList K;
    public ArrayList L;
    public C11434xT0 M;
    public final RunnableC9034qT0 N;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public C0143Bc2 g;
    public ArrayList l;
    public final C5598gT0 m;
    public final CopyOnWriteArrayList n;
    public final C5942hT0 o;
    public final C6286iT0 p;
    public final C6628jT0 q;
    public final C6972kT0 r;
    public final C8004nT0 s;
    public int t;
    public US0 u;
    public ZS0 v;
    public c w;
    public c x;
    public final C8348oT0 y;
    public final C8691pT0 z;
    public final ArrayList a = new ArrayList();
    public final NT0 c = new NT0();
    public final LayoutInflaterFactory2C4910eT0 f = new LayoutInflaterFactory2C4910eT0(this);
    public final C7660mT0 h = new C7660mT0(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [hT0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [iT0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [jT0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kT0] */
    public h() {
        Collections.synchronizedMap(new HashMap());
        this.m = new C5598gT0(this);
        this.n = new CopyOnWriteArrayList();
        this.o = new InterfaceC11989z40() { // from class: hT0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                h.this.f((Configuration) obj);
            }
        };
        this.p = new InterfaceC11989z40() { // from class: iT0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                h hVar = h.this;
                hVar.getClass();
                if (((Integer) obj).intValue() == 80) {
                    hVar.j();
                }
            }
        };
        this.q = new InterfaceC11989z40() { // from class: jT0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                h hVar = h.this;
                hVar.getClass();
                hVar.k(((C6819k02) obj).a);
            }
        };
        this.r = new InterfaceC11989z40() { // from class: kT0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                h hVar = h.this;
                hVar.getClass();
                hVar.p(((C1922Ou2) obj).a);
            }
        };
        this.s = new C8004nT0(this);
        this.t = -1;
        this.y = new C8348oT0(this);
        this.z = new C8691pT0();
        this.D = new ArrayDeque();
        this.N = new RunnableC9034qT0(this);
    }

    public final void M(k kVar) {
        c cVar = kVar.c;
        if (cVar.M) {
            if (this.b) {
                this.I = true;
            } else {
                cVar.M = false;
                kVar.k();
            }
        }
    }

    public final c A(int i) {
        NT0 nt0 = this.c;
        ArrayList arrayList = nt0.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = (c) arrayList.get(size);
                if (cVar != null && cVar.B == i) {
                    return cVar;
                }
            } else {
                for (k kVar : nt0.b.values()) {
                    if (kVar != null) {
                        c cVar2 = kVar.c;
                        if (cVar2.B == i) {
                            return cVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final c B(String str) {
        NT0 nt0 = this.c;
        if (str != null) {
            ArrayList arrayList = nt0.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                c cVar = (c) arrayList.get(size);
                if (cVar != null && str.equals(cVar.D)) {
                    return cVar;
                }
            }
        }
        if (str != null) {
            for (k kVar : nt0.b.values()) {
                if (kVar != null) {
                    c cVar2 = kVar.c;
                    if (str.equals(cVar2.D)) {
                        return cVar2;
                    }
                }
            }
        } else {
            nt0.getClass();
        }
        return null;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new YH1());
        US0 us0 = this.u;
        if (us0 == null) {
            try {
                t("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            us0.j.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void c0() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                this.h.a = true;
                return;
            }
            C7660mT0 c7660mT0 = this.h;
            ArrayList arrayList = this.d;
            c7660mT0.a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.w);
        }
    }

    public static boolean I(c cVar) {
        if (cVar != null) {
            h hVar = cVar.x;
            if (!cVar.equals(hVar.x) || !I(hVar.w)) {
                return false;
            }
        }
        return true;
    }

    public final boolean O() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        w(false);
        v(true);
        c cVar = this.x;
        if (cVar != null && i < 0 && cVar.J().O()) {
            return true;
        }
        boolean P = P(this.f11485J, this.K, i, i2);
        if (P) {
            this.b = true;
            try {
                R(this.f11485J, this.K);
            } finally {
                c();
            }
        }
        c0();
        s();
        this.c.b.values().removeAll(Collections.singleton(null));
        return P;
    }

    public static boolean H(c cVar) {
        return cVar == null || (cVar.I && (cVar.x == null || H(cVar.A)));
    }

    /* renamed from: b0 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c cVar = this.w;
        if (cVar != null) {
            sb.append(cVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.w)));
            sb.append("}");
        } else {
            US0 us0 = this.u;
            if (us0 != null) {
                sb.append(us0.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String a = AbstractC7848n0.a(str, "    ");
        NT0 nt0 = this.c;
        nt0.getClass();
        String str2 = str + "    ";
        HashMap hashMap = nt0.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (k kVar : hashMap.values()) {
                printWriter.print(str);
                if (kVar != null) {
                    c cVar = kVar.c;
                    printWriter.println(cVar);
                    cVar.H(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = nt0.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                c cVar2 = (c) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(cVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                c cVar3 = (c) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(cVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C10547us c10547us = (C10547us) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c10547us.toString());
                c10547us.h(a, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (InterfaceC10405uT0) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.v);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void V(c cVar, boolean z) {
        ViewGroup D = D(cVar);
        if (D == null || !(D instanceof C3536aT0)) {
            return;
        }
        ((C3536aT0) D).i = !z;
    }

    public final void K(int i, boolean z) {
        HashMap hashMap;
        US0 us0;
        if (this.u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.t) {
            this.t = i;
            NT0 nt0 = this.c;
            Iterator it = nt0.a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = nt0.b;
                if (!hasNext) {
                    break;
                }
                k kVar = (k) hashMap.get(((c) it.next()).k);
                if (kVar != null) {
                    kVar.k();
                }
            }
            Iterator it2 = hashMap.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                k kVar2 = (k) it2.next();
                if (kVar2 != null) {
                    kVar2.k();
                    c cVar = kVar2.c;
                    if (cVar.r && !cVar.Y()) {
                        z2 = true;
                    }
                    if (z2) {
                        nt0.h(kVar2);
                    }
                }
            }
            Z();
            if (this.E && (us0 = this.u) != null && this.t == 7) {
                us0.j.invalidateOptionsMenu();
                this.E = false;
            }
        }
    }

    public final void Z() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            M((k) it.next());
        }
    }

    public final k e(c cVar) {
        String str = cVar.k;
        NT0 nt0 = this.c;
        k kVar = (k) nt0.b.get(str);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.m, nt0, cVar);
        kVar2.m(this.u.g.getClassLoader());
        kVar2.e = this.t;
        return kVar2;
    }

    public final k a(c cVar) {
        String str = cVar.S;
        if (str != null) {
            RT0.c(cVar, str);
        }
        k e = e(cVar);
        cVar.x = this;
        NT0 nt0 = this.c;
        nt0.g(e);
        if (!cVar.F) {
            nt0.a(cVar);
            cVar.r = false;
            if (cVar.L == null) {
                cVar.P = false;
            }
            if (G(cVar)) {
                this.E = true;
            }
        }
        return e;
    }

    public final void Q(c cVar) {
        boolean z = !cVar.Y();
        if (!cVar.F || z) {
            NT0 nt0 = this.c;
            synchronized (nt0.a) {
                nt0.a.remove(cVar);
            }
            cVar.q = false;
            if (G(cVar)) {
                this.E = true;
            }
            cVar.r = true;
            Y(cVar);
        }
    }

    public final c z(String str) {
        return this.c.b(str);
    }

    public final boolean J() {
        return this.F || this.G;
    }

    public final void u(InterfaceC10405uT0 interfaceC10405uT0, boolean z) {
        if (!z) {
            if (this.u != null) {
                if (J()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.u == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(interfaceC10405uT0);
                U();
            }
        }
    }

    public final void U() {
        synchronized (this.a) {
            boolean z = true;
            if (this.a.size() != 1) {
                z = false;
            }
            if (z) {
                this.u.h.removeCallbacks(this.N);
                this.u.h.post(this.N);
                c0();
            }
        }
    }

    public final void v(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.u == null) {
            if (this.H) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (Looper.myLooper() == this.u.h.getLooper()) {
            if (!z && J()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.f11485J == null) {
                this.f11485J = new ArrayList();
                this.K = new ArrayList();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    public final void x(InterfaceC10405uT0 interfaceC10405uT0, boolean z) {
        if (z && (this.u == null || this.H)) {
            return;
        }
        v(z);
        if (interfaceC10405uT0.a(this.f11485J, this.K)) {
            this.b = true;
            try {
                R(this.f11485J, this.K);
            } finally {
                c();
            }
        }
        c0();
        s();
        this.c.b.values().removeAll(Collections.singleton(null));
    }

    public final void c() {
        this.b = false;
        this.K.clear();
        this.f11485J.clear();
    }

    public final boolean w(boolean z) {
        boolean z2;
        v(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f11485J;
            ArrayList arrayList2 = this.K;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.a.size();
                        z2 = false;
                        for (int i = 0; i < size; i++) {
                            z2 |= ((InterfaceC10405uT0) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (z2) {
                z3 = true;
                this.b = true;
                try {
                    R(this.f11485J, this.K);
                } finally {
                    c();
                }
            } else {
                c0();
                s();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z3;
            }
        }
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C10547us) arrayList.get(i)).p) {
                if (i2 != i) {
                    y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C10547us) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            y(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:211:0x0375. Please report as an issue. */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C10547us c10547us;
        NT0 nt0;
        NT0 nt02;
        NT0 nt03;
        int i3;
        int i4;
        int i5;
        c cVar;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z = ((C10547us) arrayList3.get(i)).p;
        ArrayList arrayList5 = this.L;
        if (arrayList5 == null) {
            this.L = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.L;
        NT0 nt04 = this.c;
        arrayList6.addAll(nt04.f());
        c cVar2 = this.x;
        int i6 = i;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                NT0 nt05 = nt04;
                this.L.clear();
                if (!z && this.t >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C10547us) arrayList.get(i8)).a.iterator();
                        while (it.hasNext()) {
                            c cVar3 = ((TT0) it.next()).b;
                            if (cVar3 == null || cVar3.x == null) {
                                nt0 = nt05;
                            } else {
                                nt0 = nt05;
                                nt0.g(e(cVar3));
                            }
                            nt05 = nt0;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C10547us c10547us2 = (C10547us) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c10547us2.d(-1);
                        ArrayList arrayList7 = c10547us2.a;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            TT0 tt0 = (TT0) arrayList7.get(size);
                            c cVar4 = tt0.b;
                            if (cVar4 != null) {
                                if (cVar4.O != null) {
                                    cVar4.I().a = true;
                                }
                                int i10 = c10547us2.f;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 8197;
                                        i12 = 4100;
                                        if (i10 != 8197) {
                                            if (i10 == 4099) {
                                                i11 = 4099;
                                            } else if (i10 != 4100) {
                                                i11 = 0;
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                if (cVar4.O != null || i11 != 0) {
                                    cVar4.I();
                                    cVar4.O.f = i11;
                                }
                                ArrayList arrayList8 = c10547us2.o;
                                ArrayList arrayList9 = c10547us2.n;
                                cVar4.I();
                                NS0 ns0 = cVar4.O;
                                ns0.g = arrayList8;
                                ns0.h = arrayList9;
                            }
                            int i13 = tt0.a;
                            h hVar = c10547us2.q;
                            switch (i13) {
                                case 1:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.V(cVar4, true);
                                    hVar.Q(cVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + tt0.a);
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.a(cVar4);
                                    break;
                                case 4:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.getClass();
                                    if (cVar4.E) {
                                        cVar4.E = false;
                                        cVar4.P = !cVar4.P;
                                        break;
                                    } else {
                                        break;
                                    }
                                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.V(cVar4, true);
                                    if (cVar4.E) {
                                        break;
                                    } else {
                                        cVar4.E = true;
                                        cVar4.P = !cVar4.P;
                                        hVar.Y(cVar4);
                                        break;
                                    }
                                case 6:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.getClass();
                                    if (cVar4.F) {
                                        cVar4.F = false;
                                        if (cVar4.q) {
                                            break;
                                        } else {
                                            hVar.c.a(cVar4);
                                            if (G(cVar4)) {
                                                hVar.E = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                case 7:
                                    cVar4.D0(tt0.d, tt0.e, tt0.f, tt0.g);
                                    hVar.V(cVar4, true);
                                    if (cVar4.F) {
                                        continue;
                                    } else {
                                        cVar4.F = true;
                                        if (cVar4.q) {
                                            NT0 nt06 = hVar.c;
                                            synchronized (nt06.a) {
                                                nt06.a.remove(cVar4);
                                            }
                                            cVar4.q = false;
                                            if (G(cVar4)) {
                                                hVar.E = true;
                                            }
                                            hVar.Y(cVar4);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    }
                                case 8:
                                    hVar.X(null);
                                    break;
                                case 9:
                                    hVar.X(cVar4);
                                    break;
                                case 10:
                                    hVar.W(cVar4, tt0.h);
                                    break;
                            }
                        }
                    } else {
                        c10547us2.d(1);
                        ArrayList arrayList10 = c10547us2.a;
                        int size2 = arrayList10.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TT0 tt02 = (TT0) arrayList10.get(i14);
                            c cVar5 = tt02.b;
                            if (cVar5 != null) {
                                if (cVar5.O != null) {
                                    cVar5.I().a = false;
                                }
                                int i15 = c10547us2.f;
                                if (cVar5.O != null || i15 != 0) {
                                    cVar5.I();
                                    cVar5.O.f = i15;
                                }
                                ArrayList arrayList11 = c10547us2.n;
                                ArrayList arrayList12 = c10547us2.o;
                                cVar5.I();
                                NS0 ns02 = cVar5.O;
                                ns02.g = arrayList11;
                                ns02.h = arrayList12;
                            }
                            int i16 = tt02.a;
                            h hVar2 = c10547us2.q;
                            switch (i16) {
                                case 1:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.V(cVar5, false);
                                    hVar2.a(cVar5);
                                    i14++;
                                    c10547us2 = c10547us;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + tt02.a);
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.Q(cVar5);
                                    i14++;
                                    c10547us2 = c10547us;
                                case 4:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.getClass();
                                    if (!cVar5.E) {
                                        cVar5.E = true;
                                        cVar5.P = !cVar5.P;
                                        hVar2.Y(cVar5);
                                    }
                                    i14++;
                                    c10547us2 = c10547us;
                                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.V(cVar5, false);
                                    if (cVar5.E) {
                                        cVar5.E = false;
                                        cVar5.P = !cVar5.P;
                                    }
                                    i14++;
                                    c10547us2 = c10547us;
                                case 6:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.getClass();
                                    if (!cVar5.F) {
                                        cVar5.F = true;
                                        if (cVar5.q) {
                                            NT0 nt07 = hVar2.c;
                                            synchronized (nt07.a) {
                                                nt07.a.remove(cVar5);
                                            }
                                            cVar5.q = false;
                                            if (G(cVar5)) {
                                                hVar2.E = true;
                                            }
                                            hVar2.Y(cVar5);
                                        }
                                    }
                                    i14++;
                                    c10547us2 = c10547us;
                                case 7:
                                    c10547us = c10547us2;
                                    cVar5.D0(tt02.d, tt02.e, tt02.f, tt02.g);
                                    hVar2.V(cVar5, false);
                                    if (cVar5.F) {
                                        cVar5.F = false;
                                        if (!cVar5.q) {
                                            hVar2.c.a(cVar5);
                                            if (G(cVar5)) {
                                                hVar2.E = true;
                                            }
                                        }
                                    }
                                    i14++;
                                    c10547us2 = c10547us;
                                case 8:
                                    hVar2.X(cVar5);
                                    c10547us = c10547us2;
                                    i14++;
                                    c10547us2 = c10547us;
                                case 9:
                                    hVar2.X(null);
                                    c10547us = c10547us2;
                                    i14++;
                                    c10547us2 = c10547us;
                                case 10:
                                    hVar2.W(cVar5, tt02.i);
                                    c10547us = c10547us2;
                                    i14++;
                                    c10547us2 = c10547us;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C10547us c10547us3 = (C10547us) arrayList.get(i17);
                    if (booleanValue) {
                        for (int size3 = c10547us3.a.size() - 1; size3 >= 0; size3--) {
                            c cVar6 = ((TT0) c10547us3.a.get(size3)).b;
                            if (cVar6 != null) {
                                e(cVar6).k();
                            }
                        }
                    } else {
                        Iterator it2 = c10547us3.a.iterator();
                        while (it2.hasNext()) {
                            c cVar7 = ((TT0) it2.next()).b;
                            if (cVar7 != null) {
                                e(cVar7).k();
                            }
                        }
                    }
                }
                K(this.t, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C10547us) arrayList.get(i18)).a.iterator();
                    while (it3.hasNext()) {
                        c cVar8 = ((TT0) it3.next()).b;
                        if (cVar8 != null && (viewGroup = cVar8.K) != null) {
                            hashSet.add(AbstractC2633Ug3.f(viewGroup, F()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AbstractC2633Ug3 abstractC2633Ug3 = (AbstractC2633Ug3) it4.next();
                    abstractC2633Ug3.d = booleanValue;
                    abstractC2633Ug3.g();
                    abstractC2633Ug3.c();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C10547us c10547us4 = (C10547us) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c10547us4.s >= 0) {
                        c10547us4.s = -1;
                    }
                    c10547us4.getClass();
                }
                if (!z2 || this.l == null) {
                    return;
                }
                for (int i20 = 0; i20 < this.l.size(); i20++) {
                    PassphraseActivity passphraseActivity = (PassphraseActivity) ((InterfaceC10062tT0) this.l.get(i20));
                    ArrayList arrayList13 = passphraseActivity.h0().d;
                    if ((arrayList13 != null ? arrayList13.size() : 0) == 0) {
                        passphraseActivity.finish();
                    }
                }
                return;
            }
            C10547us c10547us5 = (C10547us) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                nt02 = nt04;
                int i21 = 1;
                ArrayList arrayList14 = this.L;
                ArrayList arrayList15 = c10547us5.a;
                int size4 = arrayList15.size() - 1;
                while (size4 >= 0) {
                    TT0 tt03 = (TT0) arrayList15.get(size4);
                    int i22 = tt03.a;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    cVar2 = null;
                                    break;
                                case 9:
                                    cVar2 = tt03.b;
                                    break;
                                case 10:
                                    tt03.i = tt03.h;
                                    break;
                            }
                            size4--;
                            i21 = 1;
                        }
                        arrayList14.add(tt03.b);
                        size4--;
                        i21 = 1;
                    }
                    arrayList14.remove(tt03.b);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList arrayList16 = this.L;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList17 = c10547us5.a;
                    if (i23 < arrayList17.size()) {
                        TT0 tt04 = (TT0) arrayList17.get(i23);
                        int i24 = tt04.a;
                        if (i24 != i7) {
                            if (i24 == 2) {
                                c cVar9 = tt04.b;
                                int i25 = cVar9.C;
                                int size5 = arrayList16.size() - 1;
                                boolean z3 = false;
                                while (size5 >= 0) {
                                    NT0 nt08 = nt04;
                                    c cVar10 = (c) arrayList16.get(size5);
                                    if (cVar10.C != i25) {
                                        i4 = i25;
                                    } else if (cVar10 == cVar9) {
                                        i4 = i25;
                                        z3 = true;
                                    } else {
                                        if (cVar10 == cVar2) {
                                            i4 = i25;
                                            i5 = 0;
                                            arrayList17.add(i23, new TT0(9, cVar10, 0));
                                            i23++;
                                            cVar2 = null;
                                        } else {
                                            i4 = i25;
                                            i5 = 0;
                                        }
                                        TT0 tt05 = new TT0(3, cVar10, i5);
                                        tt05.d = tt04.d;
                                        tt05.f = tt04.f;
                                        tt05.e = tt04.e;
                                        tt05.g = tt04.g;
                                        arrayList17.add(i23, tt05);
                                        arrayList16.remove(cVar10);
                                        i23++;
                                        cVar2 = cVar2;
                                    }
                                    size5--;
                                    i25 = i4;
                                    nt04 = nt08;
                                }
                                nt03 = nt04;
                                i3 = 1;
                                if (z3) {
                                    arrayList17.remove(i23);
                                    i23--;
                                } else {
                                    tt04.a = 1;
                                    tt04.c = true;
                                    arrayList16.add(cVar9);
                                }
                            } else if (i24 == 3 || i24 == 6) {
                                arrayList16.remove(tt04.b);
                                c cVar11 = tt04.b;
                                if (cVar11 == cVar2) {
                                    arrayList17.add(i23, new TT0(9, cVar11));
                                    i23++;
                                    cVar = null;
                                    cVar2 = cVar;
                                    nt03 = nt04;
                                    i3 = 1;
                                }
                                cVar = cVar2;
                                cVar2 = cVar;
                                nt03 = nt04;
                                i3 = 1;
                            } else if (i24 != 7) {
                                if (i24 == 8) {
                                    arrayList17.add(i23, new TT0(9, cVar2, 0));
                                    tt04.c = true;
                                    i23++;
                                    cVar = tt04.b;
                                    cVar2 = cVar;
                                    nt03 = nt04;
                                    i3 = 1;
                                }
                                cVar = cVar2;
                                cVar2 = cVar;
                                nt03 = nt04;
                                i3 = 1;
                            } else {
                                nt03 = nt04;
                                i3 = 1;
                            }
                            i23 += i3;
                            i7 = i3;
                            nt04 = nt03;
                        } else {
                            nt03 = nt04;
                            i3 = i7;
                        }
                        arrayList16.add(tt04.b);
                        i23 += i3;
                        i7 = i3;
                        nt04 = nt03;
                    } else {
                        nt02 = nt04;
                    }
                }
            }
            z2 = z2 || c10547us5.g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            nt04 = nt02;
        }
    }

    public final void Y(c cVar) {
        ViewGroup D = D(cVar);
        if (D != null) {
            NS0 ns0 = cVar.O;
            if ((ns0 == null ? 0 : ns0.e) + (ns0 == null ? 0 : ns0.d) + (ns0 == null ? 0 : ns0.c) + (ns0 == null ? 0 : ns0.b) > 0) {
                if (D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    D.setTag(R.id.visible_removing_fragment_view_tag, cVar);
                }
                c cVar2 = (c) D.getTag(R.id.visible_removing_fragment_view_tag);
                NS0 ns02 = cVar.O;
                boolean z = ns02 != null ? ns02.a : false;
                if (cVar2.O == null) {
                    return;
                }
                cVar2.I().a = z;
            }
        }
    }

    public final ViewGroup D(c cVar) {
        ViewGroup viewGroup = cVar.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (cVar.C > 0 && this.v.c()) {
            View b = this.v.b(cVar.C);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    public final void C() {
        Iterator it = d().iterator();
        while (it.hasNext()) {
            AbstractC2633Ug3 abstractC2633Ug3 = (AbstractC2633Ug3) it.next();
            if (abstractC2633Ug3.e) {
                abstractC2633Ug3.e = false;
                abstractC2633Ug3.c();
            }
        }
    }

    public final HashSet d() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((k) it.next()).c.K;
            if (viewGroup != null) {
                hashSet.add(AbstractC2633Ug3.f(viewGroup, F()));
            }
        }
        return hashSet;
    }

    public final void s() {
        if (this.I) {
            this.I = false;
            Z();
        }
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : (-1) + this.d.size();
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    C10547us c10547us = (C10547us) this.d.get(size);
                    if (i >= 0 && i == c10547us.s) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z) {
                        while (size > 0) {
                            int i4 = size - 1;
                            C10547us c10547us2 = (C10547us) this.d.get(i4);
                            if (i < 0 || i != c10547us2.s) {
                                break;
                            }
                            size = i4;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C10547us) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final Bundle T() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        C();
        Iterator it = d().iterator();
        while (it.hasNext()) {
            ((AbstractC2633Ug3) it.next()).e();
        }
        w(true);
        this.F = true;
        this.M.m = true;
        NT0 nt0 = this.c;
        nt0.getClass();
        HashMap hashMap = nt0.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (k kVar : hashMap.values()) {
            if (kVar != null) {
                c cVar = kVar.c;
                nt0.i(cVar.k, kVar.o());
                arrayList2.add(cVar.k);
            }
        }
        HashMap hashMap2 = this.c.c;
        if (!hashMap2.isEmpty()) {
            NT0 nt02 = this.c;
            synchronized (nt02.a) {
                backStackRecordStateArr = null;
                if (nt02.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(nt02.a.size());
                    Iterator it2 = nt02.a.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((c) it2.next()).k);
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C10547us) this.d.get(i));
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.g = arrayList;
            fragmentManagerState.h = backStackRecordStateArr;
            fragmentManagerState.i = this.i.get();
            c cVar2 = this.x;
            if (cVar2 != null) {
                fragmentManagerState.j = cVar2.k;
            }
            fragmentManagerState.k.addAll(this.j.keySet());
            fragmentManagerState.l.addAll(this.j.values());
            fragmentManagerState.m = new ArrayList(this.D);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle(AbstractC4809e90.a("result_", str), (Bundle) this.k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AbstractC4809e90.a("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void S(Bundle bundle) {
        C5598gT0 c5598gT0;
        int i;
        k kVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.u.g.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.u.g.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        NT0 nt0 = this.c;
        HashMap hashMap2 = nt0.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = nt0.b;
        hashMap3.clear();
        Iterator it = fragmentManagerState.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5598gT0 = this.m;
            if (!hasNext) {
                break;
            }
            Bundle i2 = nt0.i((String) it.next(), null);
            if (i2 != null) {
                c cVar = (c) this.M.h.get(((FragmentState) i2.getParcelable("state")).g);
                if (cVar != null) {
                    kVar = new k(c5598gT0, nt0, cVar, i2);
                } else {
                    kVar = new k(this.m, this.c, this.u.g.getClassLoader(), E(), i2);
                }
                c cVar2 = kVar.c;
                cVar2.g = i2;
                cVar2.x = this;
                kVar.m(this.u.g.getClassLoader());
                nt0.g(kVar);
                kVar.e = this.t;
            }
        }
        C11434xT0 c11434xT0 = this.M;
        c11434xT0.getClass();
        Iterator it2 = new ArrayList(c11434xT0.h.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            c cVar3 = (c) it2.next();
            if ((hashMap3.get(cVar3.k) != null ? 1 : 0) == 0) {
                C11434xT0 c11434xT02 = this.M;
                if (!c11434xT02.m) {
                    c11434xT02.h.remove(cVar3.k);
                }
                cVar3.x = this;
                k kVar2 = new k(c5598gT0, nt0, cVar3);
                kVar2.e = 1;
                kVar2.k();
                cVar3.r = true;
                kVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.g;
        nt0.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                c b = nt0.b(str3);
                if (b == null) {
                    throw new IllegalStateException(AbstractC4199cO1.a("No instantiated fragment for (", str3, ")"));
                }
                nt0.a(b);
            }
        }
        if (fragmentManagerState.h != null) {
            this.d = new ArrayList(fragmentManagerState.h.length);
            int i3 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.h;
                if (i3 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i3];
                backStackRecordState.getClass();
                C10547us c10547us = new C10547us(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    TT0 tt0 = new TT0();
                    int i6 = i4 + 1;
                    tt0.a = iArr[i4];
                    tt0.h = EnumC11683yA1.values()[backStackRecordState.h[i5]];
                    tt0.i = EnumC11683yA1.values()[backStackRecordState.i[i5]];
                    int i7 = i6 + 1;
                    tt0.c = iArr[i6] != 0;
                    int i8 = i7 + 1;
                    int i9 = iArr[i7];
                    tt0.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    tt0.e = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    tt0.f = i13;
                    int i14 = iArr[i12];
                    tt0.g = i14;
                    c10547us.b = i9;
                    c10547us.c = i11;
                    c10547us.d = i13;
                    c10547us.e = i14;
                    c10547us.b(tt0);
                    i5++;
                    i4 = i12 + 1;
                }
                c10547us.f = backStackRecordState.j;
                c10547us.i = backStackRecordState.k;
                c10547us.g = true;
                c10547us.j = backStackRecordState.m;
                c10547us.k = backStackRecordState.n;
                c10547us.l = backStackRecordState.o;
                c10547us.m = backStackRecordState.p;
                c10547us.n = backStackRecordState.q;
                c10547us.o = backStackRecordState.r;
                c10547us.p = backStackRecordState.s;
                c10547us.s = backStackRecordState.l;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.g;
                    if (i15 < arrayList2.size()) {
                        String str4 = (String) arrayList2.get(i15);
                        if (str4 != null) {
                            ((TT0) c10547us.a.get(i15)).b = z(str4);
                        }
                        i15++;
                    }
                }
                c10547us.d(1);
                this.d.add(c10547us);
                i3++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.i);
        String str5 = fragmentManagerState.j;
        if (str5 != null) {
            c z = z(str5);
            this.x = z;
            o(z);
        }
        ArrayList arrayList3 = fragmentManagerState.k;
        if (arrayList3 != null) {
            while (i < arrayList3.size()) {
                this.j.put((String) arrayList3.get(i), (BackStackState) fragmentManagerState.l.get(i));
                i++;
            }
        }
        this.D = new ArrayDeque(fragmentManagerState.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(US0 us0, ZS0 zs0, c cVar) {
        if (this.u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.u = us0;
        this.v = zs0;
        this.w = cVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (cVar != 0) {
            copyOnWriteArrayList.add(new C9376rT0(cVar));
        } else if (us0 instanceof InterfaceC11777yT0) {
            copyOnWriteArrayList.add(us0);
        }
        if (this.w != null) {
            c0();
        }
        if (us0 instanceof InterfaceC0273Cc2) {
            C0143Bc2 c0143Bc2 = us0.j.l;
            this.g = c0143Bc2;
            c0143Bc2.a(cVar != 0 ? cVar : us0, this.h);
        }
        if (cVar != 0) {
            C11434xT0 c11434xT0 = cVar.x.M;
            HashMap hashMap = c11434xT0.i;
            C11434xT0 c11434xT02 = (C11434xT0) hashMap.get(cVar.k);
            if (c11434xT02 == null) {
                c11434xT02 = new C11434xT0(c11434xT0.k);
                hashMap.put(cVar.k, c11434xT02);
            }
            this.M = c11434xT02;
        } else if (us0 instanceof InterfaceC12177zd4) {
            this.M = (C11434xT0) new C11491xd4(us0.w(), C11434xT0.n).a(C11434xT0.class);
        } else {
            this.M = new C11434xT0(false);
        }
        this.M.m = J();
        this.c.d = this.M;
        US0 us02 = this.u;
        if ((us02 instanceof InterfaceC10417uV2) && cVar == 0) {
            C9731sV2 A = us02.A();
            A.b("android:support:fragments", new InterfaceC9388rV2() { // from class: lT0
                @Override // defpackage.InterfaceC9388rV2
                public final Bundle a() {
                    return h.this.T();
                }
            });
            Bundle a = A.a("android:support:fragments");
            if (a != null) {
                S(a);
            }
        }
        US0 us03 = this.u;
        if (us03 instanceof InterfaceC4103c6) {
            C5099f00 c5099f00 = us03.j.m;
            String a2 = AbstractC4809e90.a("FragmentManager:", cVar != 0 ? Y5.a(new StringBuilder(), cVar.k, ":") : "");
            this.A = c5099f00.b(AbstractC7848n0.a(a2, "StartActivityForResult"), new W5(), new e(this));
            this.B = c5099f00.b(AbstractC7848n0.a(a2, "StartIntentSenderForResult"), new C9719sT0(), new f(this));
            this.C = c5099f00.b(AbstractC7848n0.a(a2, "RequestPermissions"), new V5(), new d(this));
        }
        US0 us04 = this.u;
        if (us04 instanceof InterfaceC1832Oc2) {
            us04.e(this.o);
        }
        US0 us05 = this.u;
        if (us05 instanceof InterfaceC8059nd2) {
            us05.h(this.p);
        }
        US0 us06 = this.u;
        if (us06 instanceof InterfaceC4965ed2) {
            us06.f(this.q);
        }
        US0 us07 = this.u;
        if (us07 instanceof InterfaceC5309fd2) {
            us07.g(this.r);
        }
        US0 us08 = this.u;
        if ((us08 instanceof YS1) && cVar == 0) {
            us08.d(this.s);
        }
    }

    public final void L() {
        if (this.u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.m = false;
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                cVar.z.L();
            }
        }
    }

    public final void i() {
        boolean z = true;
        this.H = true;
        w(true);
        Iterator it = d().iterator();
        while (it.hasNext()) {
            ((AbstractC2633Ug3) it.next()).e();
        }
        US0 us0 = this.u;
        boolean z2 = us0 instanceof InterfaceC12177zd4;
        NT0 nt0 = this.c;
        if (z2) {
            z = nt0.d.l;
        } else {
            Context context = us0.g;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((BackStackState) it2.next()).a.iterator();
                while (it3.hasNext()) {
                    nt0.d.b((String) it3.next());
                }
            }
        }
        r(-1);
        US0 us02 = this.u;
        if (us02 instanceof InterfaceC8059nd2) {
            us02.m(this.p);
        }
        US0 us03 = this.u;
        if (us03 instanceof InterfaceC1832Oc2) {
            us03.j(this.o);
        }
        US0 us04 = this.u;
        if (us04 instanceof InterfaceC4965ed2) {
            us04.k(this.q);
        }
        US0 us05 = this.u;
        if (us05 instanceof InterfaceC5309fd2) {
            us05.l(this.r);
        }
        US0 us06 = this.u;
        if (us06 instanceof YS1) {
            us06.i(this.s);
        }
        this.u = null;
        this.v = null;
        this.w = null;
        if (this.g != null) {
            Iterator it4 = this.h.b.iterator();
            while (it4.hasNext()) {
                ((LF) it4.next()).cancel();
            }
            this.g = null;
        }
        Z5 z5 = this.A;
        if (z5 != null) {
            z5.b();
            this.B.b();
            this.C.b();
        }
    }

    public final void r(int i) {
        try {
            this.b = true;
            for (k kVar : this.c.b.values()) {
                if (kVar != null) {
                    kVar.e = i;
                }
            }
            K(i, false);
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((AbstractC2633Ug3) it.next()).e();
            }
            this.b = false;
            w(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void k(boolean z) {
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                cVar.z.k(z);
            }
        }
    }

    public final void p(boolean z) {
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                cVar.z.p(z);
            }
        }
    }

    public final void f(Configuration configuration) {
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                cVar.onConfigurationChanged(configuration);
                cVar.z.f(configuration);
            }
        }
    }

    public final void j() {
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                cVar.onLowMemory();
                cVar.z.j();
            }
        }
    }

    public final boolean h(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        if (this.t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (c cVar : this.c.f()) {
            if (cVar != null && H(cVar)) {
                if (cVar.E) {
                    z = false;
                } else {
                    if (cVar.H && cVar.I) {
                        cVar.h0(menu, menuInflater);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2 | cVar.z.h(menu, menuInflater);
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar);
                    z3 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                c cVar2 = (c) this.e.get(i);
                if (arrayList == null || !arrayList.contains(cVar2)) {
                    cVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z3;
    }

    public final boolean q(Menu menu) {
        boolean z;
        boolean z2;
        if (this.t < 1) {
            return false;
        }
        boolean z3 = false;
        for (c cVar : this.c.f()) {
            if (cVar != null && H(cVar)) {
                if (cVar.E) {
                    z = false;
                } else {
                    if (cVar.H && cVar.I) {
                        cVar.q0(menu);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = cVar.z.q(menu) | z2;
                }
                if (z) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final boolean m(MenuItem menuItem) {
        boolean z;
        if (this.t < 1) {
            return false;
        }
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                if (cVar.E) {
                    z = false;
                } else {
                    z = (cVar.H && cVar.I && cVar.o0(menuItem)) ? true : cVar.z.m(menuItem);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g() {
        if (this.t < 1) {
            return false;
        }
        for (c cVar : this.c.f()) {
            if (cVar != null) {
                if (!cVar.E ? cVar.z.g() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void n() {
        if (this.t < 1) {
            return;
        }
        for (c cVar : this.c.f()) {
            if (cVar != null && !cVar.E) {
                cVar.z.n();
            }
        }
    }

    public final void X(c cVar) {
        if (cVar != null && (!cVar.equals(z(cVar.k)) || (cVar.y != null && cVar.x != this))) {
            throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
        }
        c cVar2 = this.x;
        this.x = cVar;
        o(cVar2);
        o(this.x);
    }

    public final void o(c cVar) {
        if (cVar == null || !cVar.equals(z(cVar.k))) {
            return;
        }
        cVar.x.getClass();
        boolean I = I(cVar);
        Boolean bool = cVar.p;
        if (bool == null || bool.booleanValue() != I) {
            cVar.p = Boolean.valueOf(I);
            h hVar = cVar.z;
            hVar.c0();
            hVar.o(hVar.x);
        }
    }

    public final void W(c cVar, EnumC11683yA1 enumC11683yA1) {
        if (!cVar.equals(z(cVar.k)) || (cVar.y != null && cVar.x != this)) {
            throw new IllegalArgumentException("Fragment " + cVar + " is not an active fragment of FragmentManager " + this);
        }
        cVar.T = enumC11683yA1;
    }

    public final C8348oT0 E() {
        c cVar = this.w;
        if (cVar != null) {
            return cVar.x.E();
        }
        return this.y;
    }

    public final C8691pT0 F() {
        c cVar = this.w;
        if (cVar != null) {
            return cVar.x.F();
        }
        return this.z;
    }

    public final void l() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.X();
                cVar.z.l();
            }
        }
    }

    public static boolean G(c cVar) {
        boolean z;
        if (cVar.H && cVar.I) {
            return true;
        }
        Iterator it = cVar.z.c.e().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            c cVar2 = (c) it.next();
            if (cVar2 != null) {
                z2 = G(cVar2);
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }
}
