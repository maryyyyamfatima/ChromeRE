package defpackage;

import j$.util.function.Consumer;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pd4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8748pd4 implements InterfaceC9091qd4 {
    public final HashSet a = new HashSet();

    @Override // defpackage.InterfaceC9091qd4
    public final void c() {
        h(new Consumer() { // from class: jd4
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).c();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void f() {
        h(new Consumer() { // from class: ld4
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).f();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void g() {
        h(new Consumer() { // from class: md4
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).g();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void d(final int i, final int i2) {
        h(new Consumer() { // from class: kd4
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).d(i, i2);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void a() {
        h(new Consumer() { // from class: od4
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).a();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void e(final int i, final int i2) {
        h(new Consumer() { // from class: nd4
            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).e(i, i2);
            }
        });
    }

    @Override // defpackage.InterfaceC9091qd4
    public final void b() {
        h(new Consumer() { // from class: id4
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC9091qd4) obj).b();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void h(Consumer consumer) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            consumer.accept((InterfaceC9091qd4) it.next());
        }
    }
}
