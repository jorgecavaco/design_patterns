package com.github.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface State {
    void pull(CeilingFanPullChain2 wrapper);
}

class CeilingFanPullChain2 {
    private State currentState;

    public CeilingFanPullChain2() {
        currentState = new Off();
    }

    public void set_state(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}

class Off implements State {
    public void pull(CeilingFanPullChain2 wrapper) {
        System.out.println("Off speed");
        wrapper.set_state(new Low());

    }
}

class Low implements State {
    public void pull(CeilingFanPullChain2 wrapper) {
        System.out.println("Low speed");
        wrapper.set_state(new High());

    }
}

class Medium implements State {
    public void pull(CeilingFanPullChain2 wrapper) {
        System.out.println("Medium speed");
        wrapper.set_state(new Off());

    }
}

class High implements State {
    public void pull(CeilingFanPullChain2 wrapper) {
        System.out.println("turning High");
        wrapper.set_state(new Medium());

    }
}

public class StateDemo2 {
    public static void main(String[] args) {
        CeilingFanPullChain2 chain = new CeilingFanPullChain2();
        while (true) {
            System.out.println("Press ENTER");
            getLine();
            chain.pull();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
