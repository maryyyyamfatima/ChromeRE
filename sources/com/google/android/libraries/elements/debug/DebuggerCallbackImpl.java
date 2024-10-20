package com.google.android.libraries.elements.debug;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.chrome.R;
import com.google.android.libraries.elements.debug.DebuggerCallbackImpl;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC0952Hi1;
import defpackage.AbstractC11581xs4;
import defpackage.AbstractC12203zi0;
import defpackage.AbstractC4147cE;
import defpackage.AbstractC7504m0;
import defpackage.AbstractC9095qe2;
import defpackage.B10;
import defpackage.BY;
import defpackage.C0172Bi1;
import defpackage.C0376Cx0;
import defpackage.C0822Gi1;
import defpackage.C10172tm3;
import defpackage.C10488ui0;
import defpackage.C10515um3;
import defpackage.C11064wN3;
import defpackage.C11279x00;
import defpackage.C1127Ir1;
import defpackage.C11703yE1;
import defpackage.C2254Rj;
import defpackage.C2479Tc;
import defpackage.C2845Vx0;
import defpackage.C2975Wx0;
import defpackage.C3025Xh0;
import defpackage.C3235Yx0;
import defpackage.C3365Zx0;
import defpackage.C3714ay0;
import defpackage.C4057by0;
import defpackage.C4401cy0;
import defpackage.C4744dy0;
import defpackage.C4776e33;
import defpackage.C5088ey0;
import defpackage.C5432fy0;
import defpackage.C5571gN3;
import defpackage.C5776gy0;
import defpackage.C5915hN3;
import defpackage.C6120hy0;
import defpackage.C6827k14;
import defpackage.C7188l43;
import defpackage.C7633mN3;
import defpackage.C7931nE2;
import defpackage.C7977nN3;
import defpackage.C8199o10;
import defpackage.C8774pi0;
import defpackage.C8801pm3;
import defpackage.C9144qm3;
import defpackage.C9486rm3;
import defpackage.C9829sm3;
import defpackage.EnumC10209ts4;
import defpackage.InterfaceC11517xi0;
import defpackage.InterfaceC11989z40;
import defpackage.InterfaceC1377Kp1;
import defpackage.InterfaceC9989tE2;
import defpackage.J71;
import defpackage.K71;
import defpackage.OL2;
import defpackage.QE2;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.RunnableC8431oi0;
import defpackage.WZ;
import defpackage.XF0;
import defpackage.ZD;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DebuggerCallbackImpl extends DebuggerCallback implements Application.ActivityLifecycleCallbacks, InterfaceC11517xi0 {
    private static final String TAG = "ElementsDebugger";
    private final AbstractC9095qe2 byteStore;
    private final InterfaceC9989tE2 debuggerClient;
    private FaultSubscription faultSubscription;
    private final K71 highlightController;
    private final C8774pi0 liveUpdateController;
    private final Handler mainHandler;
    private Subscription subscription;
    private final Set activities = new HashSet();
    private final Object subscriptionLock = new Object();
    private final Observer storeObserver = new Observer() { // from class: com.google.android.libraries.elements.debug.DebuggerCallbackImpl.1
        public AnonymousClass1() {
        }

        @Override // com.google.android.libraries.elements.interfaces.Observer
        public void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
            Snapshot endState;
            if (transactionRecord == null || (endState = transactionRecord.endState()) == null) {
                return;
            }
            DebuggerCallbackImpl debuggerCallbackImpl = DebuggerCallbackImpl.this;
            C9829sm3 buildStoreSnapshot = DebuggerCallbackImpl.buildStoreSnapshot(endState, transactionRecord.keys());
            if (buildStoreSnapshot.h) {
                buildStoreSnapshot.l();
                buildStoreSnapshot.h = false;
            }
            C10172tm3 c10172tm3 = (C10172tm3) buildStoreSnapshot.g;
            c10172tm3.j |= 2;
            c10172tm3.m = true;
            C11064wN3 d = AbstractC12203zi0.d();
            if (buildStoreSnapshot.h) {
                buildStoreSnapshot.l();
                buildStoreSnapshot.h = false;
            }
            C10172tm3 c10172tm32 = (C10172tm3) buildStoreSnapshot.g;
            c10172tm32.getClass();
            d.getClass();
            c10172tm32.n = d;
            c10172tm32.j |= 4;
            debuggerCallbackImpl.sendStoreSnapshot((C10172tm3) buildStoreSnapshot.j());
        }
    };
    private final FaultObserver storeFaultObserver = new FaultObserver() { // from class: com.google.android.libraries.elements.debug.DebuggerCallbackImpl.2
        public AnonymousClass2() {
        }

        @Override // com.google.android.libraries.elements.interfaces.FaultObserver
        public void storeDidFault(ByteStore byteStore, String str) {
            DebuggerCallbackImpl debuggerCallbackImpl = DebuggerCallbackImpl.this;
            C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
            C11064wN3 d = AbstractC12203zi0.d();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
            c7977nN3.getClass();
            d.getClass();
            c7977nN3.m = d;
            c7977nN3.j |= 1;
            C5571gN3 c5571gN3 = (C5571gN3) C5915hN3.l.j();
            if (c5571gN3.h) {
                c5571gN3.l();
                c5571gN3.h = false;
            }
            C5915hN3 c5915hN3 = (C5915hN3) c5571gN3.g;
            c5915hN3.getClass();
            str.getClass();
            c5915hN3.j |= 1;
            c5915hN3.k = str;
            C5915hN3 c5915hN32 = (C5915hN3) c5571gN3.j();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
            c7977nN32.getClass();
            c5915hN32.getClass();
            c7977nN32.l = c5915hN32;
            c7977nN32.k = 8;
            debuggerCallbackImpl.sendTimelineEvent((C7977nN3) c7633mN3.j());
        }
    };

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void connected() {
    }

    @Override // defpackage.InterfaceC11517xi0
    public boolean debuggerEnabled() {
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: updateComponentModelInternal */
    public void lambda$updateComponentModel$1(C11279x00 c11279x00) {
        C0376Cx0 c0376Cx0 = c11279x00.k;
        if (c0376Cx0 == null) {
            c0376Cx0 = C0376Cx0.m;
        }
        C11703yE1 findLithoViewById = findLithoViewById(c0376Cx0.k);
        if (findLithoViewById == null) {
            Log.w(TAG, "Highlight requested for non-existing LithoView: " + c0376Cx0.k);
            return;
        }
        AtomicInteger atomicInteger = AbstractC12203zi0.a;
        final C0822Gi1 a = AbstractC0952Hi1.a();
        AbstractC12203zi0.k(findLithoViewById, new InterfaceC11989z40() { // from class: yi0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                C3025Xh0 c3025Xh0 = (C3025Xh0) ((Pair) obj).second;
                BY by = ((WZ) c3025Xh0.a.V0().get(c3025Xh0.b)).t;
                Object obj2 = by != null ? by.l : null;
                if (obj2 instanceof C10488ui0) {
                    C10488ui0 c10488ui0 = (C10488ui0) obj2;
                    String str = c10488ui0.c;
                    if (str == null) {
                        str = "";
                    }
                    C0822Gi1.this.b(str, c10488ui0);
                }
            }
        });
        C10488ui0 c10488ui0 = (C10488ui0) a.a(true).get(c0376Cx0.l);
        if (c10488ui0 != null) {
            C8199o10 c8199o10 = c11279x00.l;
            if (c8199o10 == null) {
                c8199o10 = C8199o10.l;
            }
            synchronized (c10488ui0.e) {
                Component component = c10488ui0.b;
                if (component != null) {
                    component.debugSetModel(c8199o10.toByteArray());
                } else {
                    QE2 qe2 = c10488ui0.a;
                    ByteBuffer byteBuffer = C7188l43.d;
                    qe2.d(C7188l43.a(c8199o10.toByteArray()));
                }
            }
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.android.libraries.elements.debug.DebuggerCallbackImpl$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 extends Observer {
        public AnonymousClass1() {
        }

        @Override // com.google.android.libraries.elements.interfaces.Observer
        public void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
            Snapshot endState;
            if (transactionRecord == null || (endState = transactionRecord.endState()) == null) {
                return;
            }
            DebuggerCallbackImpl debuggerCallbackImpl = DebuggerCallbackImpl.this;
            C9829sm3 buildStoreSnapshot = DebuggerCallbackImpl.buildStoreSnapshot(endState, transactionRecord.keys());
            if (buildStoreSnapshot.h) {
                buildStoreSnapshot.l();
                buildStoreSnapshot.h = false;
            }
            C10172tm3 c10172tm3 = (C10172tm3) buildStoreSnapshot.g;
            c10172tm3.j |= 2;
            c10172tm3.m = true;
            C11064wN3 d = AbstractC12203zi0.d();
            if (buildStoreSnapshot.h) {
                buildStoreSnapshot.l();
                buildStoreSnapshot.h = false;
            }
            C10172tm3 c10172tm32 = (C10172tm3) buildStoreSnapshot.g;
            c10172tm32.getClass();
            d.getClass();
            c10172tm32.n = d;
            c10172tm32.j |= 4;
            debuggerCallbackImpl.sendStoreSnapshot((C10172tm3) buildStoreSnapshot.j());
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: com.google.android.libraries.elements.debug.DebuggerCallbackImpl$2 */
    /* loaded from: classes.dex */
    class AnonymousClass2 extends FaultObserver {
        public AnonymousClass2() {
        }

        @Override // com.google.android.libraries.elements.interfaces.FaultObserver
        public void storeDidFault(ByteStore byteStore, String str) {
            DebuggerCallbackImpl debuggerCallbackImpl = DebuggerCallbackImpl.this;
            C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
            C11064wN3 d = AbstractC12203zi0.d();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
            c7977nN3.getClass();
            d.getClass();
            c7977nN3.m = d;
            c7977nN3.j |= 1;
            C5571gN3 c5571gN3 = (C5571gN3) C5915hN3.l.j();
            if (c5571gN3.h) {
                c5571gN3.l();
                c5571gN3.h = false;
            }
            C5915hN3 c5915hN3 = (C5915hN3) c5571gN3.g;
            c5915hN3.getClass();
            str.getClass();
            c5915hN3.j |= 1;
            c5915hN3.k = str;
            C5915hN3 c5915hN32 = (C5915hN3) c5571gN3.j();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
            c7977nN32.getClass();
            c5915hN32.getClass();
            c7977nN32.l = c5915hN32;
            c7977nN32.k = 8;
            debuggerCallbackImpl.sendTimelineEvent((C7977nN3) c7633mN3.j());
        }
    }

    public DebuggerCallbackImpl(Context context, InterfaceC9989tE2 interfaceC9989tE2, AbstractC9095qe2 abstractC9095qe2) {
        B10.a = true;
        this.debuggerClient = interfaceC9989tE2;
        this.highlightController = new K71();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.byteStore = abstractC9095qe2;
        this.liveUpdateController = new C8774pi0(this);
        registerActivityLifecycleCallbacks(context, this);
    }

    private static void registerActivityLifecycleCallbacks(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Application application = getApplication(context);
        if (application == null) {
            throw new IllegalStateException("Failed to fetch Application");
        }
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static Application getApplication(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        if (context instanceof Service) {
            return ((Service) context).getApplication();
        }
        throw new IllegalStateException("Could not get Application from context");
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void disconnected() {
        unobserveByteStore();
        C8774pi0 c8774pi0 = this.liveUpdateController;
        c8774pi0.a.set(false);
        c8774pi0.c.mainHandler.removeCallbacks(new RunnableC8431oi0(c8774pi0));
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void configureLiveUpdating(byte[] bArr) {
        try {
            XF0 c = XF0.c();
            C3365Zx0 c3365Zx0 = C3365Zx0.l;
            int length = bArr.length;
            C3365Zx0 c3365Zx02 = new C3365Zx0();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c3365Zx02.getClass());
                    b.f(c3365Zx02, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c3365Zx02);
                    if (c3365Zx02.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c3365Zx02);
                    unobserveByteStore();
                    if (c3365Zx02.k) {
                        observeByteStore();
                        C8774pi0 c8774pi0 = this.liveUpdateController;
                        if (c8774pi0.a.getAndSet(true)) {
                            return;
                        }
                        c8774pi0.c.mainHandler.post(new RunnableC8431oi0(c8774pi0));
                        return;
                    }
                    C8774pi0 c8774pi02 = this.liveUpdateController;
                    c8774pi02.a.set(false);
                    c8774pi02.c.mainHandler.removeCallbacks(new RunnableC8431oi0(c8774pi02));
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            Log.w(TAG, "Failed to parse ConfigureLiveUpdating message", e4);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void traverseViewHierarchy() {
        this.mainHandler.post(new Runnable() { // from class: mi0
            @Override // java.lang.Runnable
            public final void run() {
                DebuggerCallbackImpl.this.traverseViewHierarchyInternal();
            }
        });
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void highlightElements(byte[] bArr) {
        try {
            XF0 c = XF0.c();
            C4776e33 c4776e33 = C4776e33.k;
            int length = bArr.length;
            C4776e33 c4776e332 = C4776e33.k;
            final C4776e33 c4776e333 = new C4776e33();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c4776e333.getClass());
                    b.f(c4776e333, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c4776e333);
                    if (c4776e333.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c4776e333);
                    this.mainHandler.post(new Runnable() { // from class: li0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DebuggerCallbackImpl.this.lambda$highlightElements$0(c4776e333);
                        }
                    });
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            Log.w(TAG, "Failed to parse PutSelectedElements message", e4);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void updateComponentModel(byte[] bArr) {
        try {
            XF0 c = XF0.c();
            C11279x00 c11279x00 = C11279x00.n;
            int length = bArr.length;
            final C11279x00 c11279x002 = new C11279x00();
            try {
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c11279x002.getClass());
                    b.f(c11279x002, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c11279x002);
                    if (c11279x002.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c11279x002);
                    this.mainHandler.post(new Runnable() { // from class: ni0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DebuggerCallbackImpl.this.lambda$updateComponentModel$1(c11279x002);
                        }
                    });
                } catch (C1127Ir1 e) {
                    if (e.g) {
                        throw new C1127Ir1(e);
                    }
                } catch (IndexOutOfBoundsException unused) {
                    throw C1127Ir1.h();
                }
            } catch (IOException e2) {
                if (e2.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e2.getCause());
                }
                throw new C1127Ir1(e2);
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            Log.w(TAG, "Failed to parse UpdateComponentModel message", e4);
        }
    }

    private void unobserveByteStore() {
        synchronized (this.subscriptionLock) {
            Subscription subscription = this.subscription;
            if (subscription != null) {
                subscription.cancel();
            }
            FaultSubscription faultSubscription = this.faultSubscription;
            if (faultSubscription != null) {
                faultSubscription.cancel();
            }
        }
    }

    private void observeByteStore() {
        if (this.byteStore.c()) {
            synchronized (this.subscriptionLock) {
                this.subscription = ((ByteStore) this.byteStore.b()).subscribe(null, this.storeObserver);
                this.faultSubscription = ((ByteStore) this.byteStore.b()).subscribeToFaults(this.storeFaultObserver);
            }
        }
    }

    public void sendStoreSnapshot(C10172tm3 c10172tm3) {
        ((DebuggerClient) this.debuggerClient.get()).sendStoreSnapshot(c10172tm3.toByteArray());
    }

    public void sendTimelineEvent(C7977nN3 c7977nN3) {
        ((DebuggerClient) this.debuggerClient.get()).sendTimelineEvent(c7977nN3.toByteArray());
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void getStoreSnapshot() {
        Snapshot snapshot;
        if (this.byteStore.c() && (snapshot = ((ByteStore) this.byteStore.b()).snapshot()) != null) {
            sendStoreSnapshot((C10172tm3) buildStoreSnapshot(snapshot, snapshot.keys()).j());
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void updateStoreEntry(byte[] bArr) {
        if (this.byteStore.c()) {
            try {
                XF0 c = XF0.c();
                C10515um3 c10515um3 = C10515um3.m;
                int length = bArr.length;
                C10515um3 c10515um32 = new C10515um3();
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c10515um32.getClass());
                            b.f(c10515um32, bArr, 0, length + 0, new C2254Rj(c));
                            b.b(c10515um32);
                            if (c10515um32.a != 0) {
                                throw new RuntimeException();
                            }
                            QX0.i(c10515um32);
                            ByteStore byteStore = (ByteStore) this.byteStore.b();
                            String str = c10515um32.k;
                            C2479Tc c2479Tc = c10515um32.l;
                            if (c2479Tc == null) {
                                c2479Tc = C2479Tc.k;
                            }
                            byteStore.set(str, c2479Tc.j.p());
                        } catch (C1127Ir1 e) {
                            if (e.g) {
                                throw new C1127Ir1(e);
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            throw C1127Ir1.h();
                        }
                    } catch (IOException e2) {
                        if (e2.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e2.getCause());
                        }
                        throw new C1127Ir1(e2);
                    }
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 e4) {
                Log.w(TAG, "Failed to parse UpdateStoreEntry message", e4);
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerCallback
    public void deleteStoreEntry(byte[] bArr) {
        if (this.byteStore.c()) {
            try {
                XF0 c = XF0.c();
                C8801pm3 c8801pm3 = C8801pm3.l;
                int length = bArr.length;
                C8801pm3 c8801pm32 = new C8801pm3();
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c8801pm32.getClass());
                            b.f(c8801pm32, bArr, 0, length + 0, new C2254Rj(c));
                            b.b(c8801pm32);
                            if (c8801pm32.a != 0) {
                                throw new RuntimeException();
                            }
                            QX0.i(c8801pm32);
                            ((ByteStore) this.byteStore.b()).set(c8801pm32.k, null);
                        } catch (IOException e) {
                            if (e.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e.getCause());
                            }
                            throw new C1127Ir1(e);
                        } catch (IndexOutOfBoundsException unused) {
                            throw C1127Ir1.h();
                        }
                    } catch (C6827k14 e2) {
                        throw e2.a();
                    }
                } catch (C1127Ir1 e3) {
                    if (e3.g) {
                        throw new C1127Ir1(e3);
                    }
                }
            } catch (C1127Ir1 e4) {
                Log.w(TAG, "Failed to parse UpdateStoreEntry message", e4);
            }
        }
    }

    public void traverseViewHierarchyInternal() {
        C6120hy0 collectElementTrees = collectElementTrees();
        if (collectElementTrees != null) {
            ((DebuggerClient) this.debuggerClient.get()).traverseViewHierarchyResponse(collectElementTrees.toByteArray());
        }
    }

    public C6120hy0 collectElementTrees() {
        Set rootViews = getRootViews();
        DisplayMetrics displayMetrics = getDisplayMetrics(this.activities, rootViews);
        if (displayMetrics == null) {
            Log.w(TAG, "Could not get DisplayMetrics");
            return null;
        }
        C5776gy0 c5776gy0 = (C5776gy0) C6120hy0.o.j();
        C2975Wx0 viewportBoundingBox = getViewportBoundingBox(displayMetrics);
        if (c5776gy0.h) {
            c5776gy0.l();
            c5776gy0.h = false;
        }
        C6120hy0 c6120hy0 = (C6120hy0) c5776gy0.g;
        c6120hy0.getClass();
        viewportBoundingBox.getClass();
        c6120hy0.l = viewportBoundingBox;
        c6120hy0.j |= 1;
        Iterator it = rootViews.iterator();
        while (it.hasNext()) {
            walkViewHierarchy((View) it.next(), c5776gy0);
        }
        return (C6120hy0) c5776gy0.j();
    }

    private static DisplayMetrics getDisplayMetrics(Set set, Set set2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!set.isEmpty()) {
            ((Activity) set.iterator().next()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        if (set2.isEmpty()) {
            return null;
        }
        ((View) set2.iterator().next()).getDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    private Set getRootViews() {
        List list;
        HashSet hashSet = new HashSet();
        Iterator it = this.activities.iterator();
        while (it.hasNext()) {
            View peekDecorView = ((Activity) it.next()).getWindow().peekDecorView();
            if (peekDecorView.hasWindowFocus()) {
                hashSet.add(peekDecorView);
            }
        }
        AtomicInteger atomicInteger = AbstractC12203zi0.a;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            list = AbstractC12203zi0.a(cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (Exception e) {
            Log.w(TAG, "Failed to get root views from WindowManager", e);
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            list = OL2.j;
        }
        for (Object obj : list) {
            if (obj instanceof View) {
                View view = (View) obj;
                if (view.getWindowVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(!(layoutParams instanceof WindowManager.LayoutParams) || (((WindowManager.LayoutParams) layoutParams).flags & 8) == 0) || view.hasWindowFocus()) {
                        arrayList.add(view);
                    }
                }
            }
        }
        hashSet.addAll(arrayList);
        return hashSet;
    }

    private static C2975Wx0 getViewportBoundingBox(DisplayMetrics displayMetrics) {
        C2845Vx0 c2845Vx0 = (C2845Vx0) C2975Wx0.o.j();
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx0 = (C2975Wx0) c2845Vx0.g;
        c2975Wx0.j |= 1;
        c2975Wx0.k = 0.0f;
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx02 = (C2975Wx0) c2845Vx0.g;
        c2975Wx02.j |= 2;
        c2975Wx02.l = 0.0f;
        float f = displayMetrics.widthPixels;
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx03 = (C2975Wx0) c2845Vx0.g;
        c2975Wx03.j |= 4;
        c2975Wx03.m = f;
        float f2 = displayMetrics.heightPixels;
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx04 = (C2975Wx0) c2845Vx0.g;
        c2975Wx04.j |= 8;
        c2975Wx04.n = f2;
        return (C2975Wx0) c2845Vx0.j();
    }

    public static void walkViewHierarchy(View view, C5776gy0 c5776gy0) {
        if (view != null && view.isShown()) {
            if (view instanceof C11703yE1) {
                C5432fy0 elementTree = getElementTree((C11703yE1) view);
                if (elementTree != null) {
                    if (c5776gy0.h) {
                        c5776gy0.l();
                        c5776gy0.h = false;
                    }
                    C6120hy0 c6120hy0 = (C6120hy0) c5776gy0.g;
                    c6120hy0.getClass();
                    InterfaceC1377Kp1 interfaceC1377Kp1 = c6120hy0.k;
                    if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                        c6120hy0.k = QX0.r(interfaceC1377Kp1);
                    }
                    c6120hy0.k.add(elementTree);
                    return;
                }
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    walkViewHierarchy(viewGroup.getChildAt(i), c5776gy0);
                }
            }
        }
    }

    public static C5432fy0 getElementTree(C11703yE1 c11703yE1) {
        AtomicInteger atomicInteger = AbstractC12203zi0.a;
        Object tag = c11703yE1.getTag(R.id.elements_tree_debug_id);
        String str = !(tag instanceof String) ? null : (String) tag;
        if (str == null) {
            return null;
        }
        final C5088ey0 c5088ey0 = (C5088ey0) C5432fy0.o.j();
        if (c5088ey0.h) {
            c5088ey0.l();
            c5088ey0.h = false;
        }
        C5432fy0 c5432fy0 = (C5432fy0) c5088ey0.g;
        c5432fy0.getClass();
        c5432fy0.j |= 1;
        c5432fy0.l = str;
        AbstractC12203zi0.k(c11703yE1, new InterfaceC11989z40() { // from class: ki0
            @Override // defpackage.InterfaceC11989z40
            public final void accept(Object obj) {
                DebuggerCallbackImpl.lambda$getElementTree$2(C5088ey0.this, (Pair) obj);
            }
        });
        return (C5432fy0) c5088ey0.j();
    }

    public static void lambda$getElementTree$2(C5088ey0 c5088ey0, Pair pair) {
        C3235Yx0 c3235Yx0;
        int[] iArr = (int[]) pair.first;
        C3025Xh0 c3025Xh0 = (C3025Xh0) pair.second;
        BY by = ((WZ) c3025Xh0.a.V0().get(c3025Xh0.b)).t;
        Object obj = by != null ? by.l : null;
        if (obj instanceof C10488ui0) {
            C10488ui0 c10488ui0 = (C10488ui0) obj;
            synchronized (c10488ui0.e) {
                c3235Yx0 = c10488ui0.d;
            }
            if (c5088ey0.h) {
                c5088ey0.l();
                c5088ey0.h = false;
            }
            C5432fy0 c5432fy0 = (C5432fy0) c5088ey0.g;
            c5432fy0.getClass();
            c3235Yx0.getClass();
            InterfaceC1377Kp1 interfaceC1377Kp1 = c5432fy0.k;
            if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                c5432fy0.k = QX0.r(interfaceC1377Kp1);
            }
            c5432fy0.k.add(c3235Yx0);
        }
        C4744dy0 componentLayoutInfo = getComponentLayoutInfo(c3025Xh0, iArr);
        if (componentLayoutInfo != null) {
            if (c5088ey0.h) {
                c5088ey0.l();
                c5088ey0.h = false;
            }
            C5432fy0 c5432fy02 = (C5432fy0) c5088ey0.g;
            c5432fy02.getClass();
            InterfaceC1377Kp1 interfaceC1377Kp12 = c5432fy02.m;
            if (!((AbstractC7504m0) interfaceC1377Kp12).a) {
                c5432fy02.m = QX0.r(interfaceC1377Kp12);
            }
            c5432fy02.m.add(componentLayoutInfo);
        }
    }

    private static C4744dy0 getComponentLayoutInfo(C3025Xh0 c3025Xh0, int[] iArr) {
        String e = c3025Xh0.e();
        if (e == null) {
            return null;
        }
        C4401cy0 c4401cy0 = (C4401cy0) C4744dy0.p.j();
        if (c4401cy0.h) {
            c4401cy0.l();
            c4401cy0.h = false;
        }
        C4744dy0 c4744dy0 = (C4744dy0) c4401cy0.g;
        c4744dy0.getClass();
        c4744dy0.j |= 1;
        c4744dy0.k = e;
        C2975Wx0 elementBoundingBox = getElementBoundingBox(c3025Xh0, iArr);
        if (c4401cy0.h) {
            c4401cy0.l();
            c4401cy0.h = false;
        }
        C4744dy0 c4744dy02 = (C4744dy0) c4401cy0.g;
        c4744dy02.getClass();
        elementBoundingBox.getClass();
        c4744dy02.l = elementBoundingBox;
        c4744dy02.j |= 2;
        AbstractC11581xs4 W0 = c3025Xh0.a.W0();
        EnumC10209ts4 enumC10209ts4 = EnumC10209ts4.g;
        float e2 = W0.e(enumC10209ts4);
        EnumC10209ts4 enumC10209ts42 = EnumC10209ts4.h;
        float e3 = W0.e(enumC10209ts42);
        EnumC10209ts4 enumC10209ts43 = EnumC10209ts4.i;
        float e4 = W0.e(enumC10209ts43);
        EnumC10209ts4 enumC10209ts44 = EnumC10209ts4.j;
        C4057by0 makeEdges = makeEdges(e2, e3, e4, W0.e(enumC10209ts44));
        if (makeEdges != null) {
            if (c4401cy0.h) {
                c4401cy0.l();
                c4401cy0.h = false;
            }
            C4744dy0 c4744dy03 = (C4744dy0) c4401cy0.g;
            c4744dy03.getClass();
            c4744dy03.m = makeEdges;
            c4744dy03.j |= 8;
        }
        C4057by0 makeEdges2 = makeEdges(W0.b(enumC10209ts4), W0.b(enumC10209ts42), W0.b(enumC10209ts43), W0.b(enumC10209ts44));
        if (makeEdges2 != null) {
            if (c4401cy0.h) {
                c4401cy0.l();
                c4401cy0.h = false;
            }
            C4744dy0 c4744dy04 = (C4744dy0) c4401cy0.g;
            c4744dy04.getClass();
            c4744dy04.n = makeEdges2;
            c4744dy04.j |= 16;
        }
        C4057by0 makeEdges3 = makeEdges(W0.f(enumC10209ts4), W0.f(enumC10209ts42), W0.f(enumC10209ts43), W0.f(enumC10209ts44));
        if (makeEdges3 != null) {
            if (c4401cy0.h) {
                c4401cy0.l();
                c4401cy0.h = false;
            }
            C4744dy0 c4744dy05 = (C4744dy0) c4401cy0.g;
            c4744dy05.getClass();
            c4744dy05.o = makeEdges3;
            c4744dy05.j |= 32;
        }
        return (C4744dy0) c4401cy0.j();
    }

    private static C2975Wx0 getElementBoundingBox(C3025Xh0 c3025Xh0, int[] iArr) {
        Rect b = c3025Xh0.b();
        C2845Vx0 c2845Vx0 = (C2845Vx0) C2975Wx0.o.j();
        float f = iArr[0] + b.left;
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx0 = (C2975Wx0) c2845Vx0.g;
        c2975Wx0.j |= 1;
        c2975Wx0.k = f;
        float f2 = iArr[1] + b.top;
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx02 = (C2975Wx0) c2845Vx0.g;
        c2975Wx02.j |= 2;
        c2975Wx02.l = f2;
        float width = b.width();
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx03 = (C2975Wx0) c2845Vx0.g;
        c2975Wx03.j |= 4;
        c2975Wx03.m = width;
        float height = b.height();
        if (c2845Vx0.h) {
            c2845Vx0.l();
            c2845Vx0.h = false;
        }
        C2975Wx0 c2975Wx04 = (C2975Wx0) c2845Vx0.g;
        c2975Wx04.j |= 8;
        c2975Wx04.n = height;
        return (C2975Wx0) c2845Vx0.j();
    }

    /* renamed from: highlightElementsInternal */
    public void lambda$highlightElements$0(C4776e33 c4776e33) {
        this.highlightController.a();
        for (C0376Cx0 c0376Cx0 : c4776e33.j) {
            C11703yE1 findLithoViewById = findLithoViewById(c0376Cx0.k);
            if (findLithoViewById == null) {
                Log.w(TAG, "Highlight requested for non-existing LithoView: " + c0376Cx0.k);
            } else {
                HashMap hashMap = C3025Xh0.c;
                C3025Xh0 e = AbstractC12203zi0.e(C3025Xh0.h(findLithoViewById.D), c0376Cx0.l);
                if (e == null) {
                    Log.w(TAG, "Highlight requested for non-existing Component: " + c0376Cx0.l);
                } else {
                    K71 k71 = this.highlightController;
                    k71.getClass();
                    C11703yE1 g = e.g();
                    if (g != null) {
                        J71 j71 = new J71(e);
                        k71.a.add(Pair.create(g, j71));
                        g.addOnAttachStateChangeListener(k71);
                        g.getOverlay().add(j71);
                        g.invalidate();
                    }
                }
            }
        }
    }

    private C11703yE1 findLithoViewById(String str) {
        Iterator it = getRootViews().iterator();
        while (it.hasNext()) {
            C11703yE1 g = AbstractC12203zi0.g((View) it.next(), str);
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.activities.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.activities.remove(activity);
    }

    @Override // defpackage.InterfaceC11517xi0
    public boolean liveUpdateEnabled() {
        return this.liveUpdateController.a.get();
    }

    private static C4057by0 makeEdges(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return null;
        }
        C3714ay0 c3714ay0 = (C3714ay0) C4057by0.o.j();
        if (c3714ay0.h) {
            c3714ay0.l();
            c3714ay0.h = false;
        }
        C4057by0 c4057by0 = (C4057by0) c3714ay0.g;
        c4057by0.j |= 1;
        c4057by0.k = f;
        if (c3714ay0.h) {
            c3714ay0.l();
            c3714ay0.h = false;
        }
        C4057by0 c4057by02 = (C4057by0) c3714ay0.g;
        c4057by02.j |= 2;
        c4057by02.l = f2;
        if (c3714ay0.h) {
            c3714ay0.l();
            c3714ay0.h = false;
        }
        C4057by0 c4057by03 = (C4057by0) c3714ay0.g;
        c4057by03.j |= 4;
        c4057by03.m = f3;
        if (c3714ay0.h) {
            c3714ay0.l();
            c3714ay0.h = false;
        }
        C4057by0 c4057by04 = (C4057by0) c3714ay0.g;
        c4057by04.j |= 8;
        c4057by04.n = f4;
        return (C4057by0) c3714ay0.j();
    }

    public static C9829sm3 buildStoreSnapshot(Snapshot snapshot, Set set) {
        C9829sm3 c9829sm3 = (C9829sm3) C10172tm3.o.j();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C9144qm3 c9144qm3 = (C9144qm3) C9486rm3.n.j();
            if (c9144qm3.h) {
                c9144qm3.l();
                c9144qm3.h = false;
            }
            C9486rm3 c9486rm3 = (C9486rm3) c9144qm3.g;
            c9486rm3.getClass();
            str.getClass();
            c9486rm3.j |= 1;
            c9486rm3.k = str;
            byte[] findNoCopy = snapshot.findNoCopy(str);
            if (findNoCopy != null) {
                ZD f = AbstractC4147cE.f(findNoCopy, 0, findNoCopy.length);
                if (c9144qm3.h) {
                    c9144qm3.l();
                    c9144qm3.h = false;
                }
                C9486rm3 c9486rm32 = (C9486rm3) c9144qm3.g;
                c9486rm32.getClass();
                c9486rm32.j |= 2;
                c9486rm32.l = f;
            }
            C9486rm3 c9486rm33 = (C9486rm3) c9144qm3.j();
            if (c9829sm3.h) {
                c9829sm3.l();
                c9829sm3.h = false;
            }
            C10172tm3 c10172tm3 = (C10172tm3) c9829sm3.g;
            c10172tm3.getClass();
            c9486rm33.getClass();
            InterfaceC1377Kp1 interfaceC1377Kp1 = c10172tm3.k;
            if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                c10172tm3.k = QX0.r(interfaceC1377Kp1);
            }
            c10172tm3.k.add(c9486rm33);
        }
        return c9829sm3;
    }
}
