package libs;

import java.util.List;

class Pair {

    public int fst;
    public int snd;

    public Pair(int fst, int snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public Pair(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
    }

    public Pair(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        if (fst != pair.fst) return false;
        return snd == pair.snd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        return result;
    }

    @Override
    public String toString() {
        return '(' + fst + ", " + snd + ')';
    }
}

class Triple {

    public int fst;
    public int snd;
    public int trd;

    public Triple(int fst, int snd, int trd) {
        this.fst = fst;
        this.snd = snd;
        this.trd = trd;
    }

    public Triple(List<Integer> list) {
        this.fst = list.get(0);
        this.snd = list.get(1);
        this.trd = list.get(2);
    }

    public Triple(int[] array) {
        this.fst = array[0];
        this.snd = array[1];
        this.trd = array[2];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triple triple = (Triple) o;

        if (fst != triple.fst) return false;
        if (snd != triple.snd) return false;
        return trd == triple.trd;

    }

    @Override
    public int hashCode() {
        int result = fst;
        result = 31 * result + snd;
        result = 31 * result + trd;
        return result;
    }

    @Override
    public String toString() {
        return '(' + fst + ", " + snd + ", " + trd + ')';
    }
}

class PriorityPair implements Comparable<PriorityPair> {

    public int e;
    public int p;

    public PriorityPair(int e, int p) {
        this.e = e;
        this.p = p;
    }

    public PriorityPair(List<Integer> list) {
        this.e = list.get(0);
        this.p = list.get(1);
    }

    public PriorityPair(int[] array) {
        this.e = array[0];
        this.p = array[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriorityPair that = (PriorityPair) o;

        if (e != that.e) return false;
        return p == that.p;

    }

    @Override
    public int hashCode() {
        int result = e;
        result = 31 * result + p;
        return result;
    }

    @Override
    public int compareTo(PriorityPair o) {
        return Integer.compare(p, o.p);
    }

    @Override
    public String toString() {
        return '(' + e + ", priority=" + p + ')';
    }
}

class PairG<S, T> {

    public S fst;
    public T snd;

    public PairG(S fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairG<?, ?> pairG = (PairG<?, ?>) o;

        if (fst != null ? !fst.equals(pairG.fst) : pairG.fst != null) return false;
        return snd != null ? snd.equals(pairG.snd) : pairG.snd == null;

    }

    @Override
    public int hashCode() {
        int result = fst != null ? fst.hashCode() : 0;
        result = 31 * result + (snd != null ? snd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return '(' + fst.toString() + ", " + snd.toString() + ')';
    }
}

