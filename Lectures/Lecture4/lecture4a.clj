;; gorilla-repl.fileformat = 1

;; **
;;; # 2D physics example from lecture 4
;; **

;; @@
(use 'nstools.ns)

(ns+ bounce-worksheet
     (:like anglican-user.worksheet)
     (:require [org.nfrac.cljbox2d.core :refer [position]])
     (:use [anglican [state 
                      :only [get-predicts 
                             get-log-weight 
                             get-result]]]))

(require '[bounce :refer [create-world
                          show-world-simulation
                          simulate-world
                          display-static-world
                          balls-in-box]] 
         :reload)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(def bumper-location1 (list))

(show-world-simulation bumper-location1)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/bumper-location1</span>","value":"#'bounce-worksheet/bumper-location1"}
;; <=

;; @@
(def bumper-location2 (list (list -3 6) (list 7 4)))

(show-world-simulation bumper-location2)
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/bumper-location2</span>","value":"#'bounce-worksheet/bumper-location2"},{"type":"html","content":"<span class='clj-unkown'>#object[quil.Applet 0x4c13de39 &quot;quil.Applet[panel40,0,0,600x500,layout=java.awt.FlowLayout]&quot;]</span>","value":"#object[quil.Applet 0x4c13de39 \"quil.Applet[panel40,0,0,600x500,layout=java.awt.FlowLayout]\"]"}],"value":"[#'bounce-worksheet/bumper-location2,#object[quil.Applet 0x4c13de39 \"quil.Applet[panel40,0,0,600x500,layout=java.awt.FlowLayout]\"]]"}
;; <=

;; @@
(def bumper-location-example
  (list (list -3 6) (list 2 5) (list 7 4) (list 12 3)))

(show-world-simulation bumper-location-example)
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/bumper-location-example</span>","value":"#'bounce-worksheet/bumper-location-example"},{"type":"html","content":"<span class='clj-unkown'>#object[quil.Applet 0x5af4ba38 &quot;quil.Applet[panel41,0,0,600x500,layout=java.awt.FlowLayout]&quot;]</span>","value":"#object[quil.Applet 0x5af4ba38 \"quil.Applet[panel41,0,0,600x500,layout=java.awt.FlowLayout]\"]"}],"value":"[#'bounce-worksheet/bumper-location-example,#object[quil.Applet 0x5af4ba38 \"quil.Applet[panel41,0,0,600x500,layout=java.awt.FlowLayout]\"]]"}
;; <=

;; @@
(def example-world
  (create-world bumper-location-example))

(def example-world-final-state 
  (simulate-world example-world))

(balls-in-box example-world-final-state)
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/example-world</span>","value":"#'bounce-worksheet/example-world"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/example-world-final-state</span>","value":"#'bounce-worksheet/example-world-final-state"}],"value":"[#'bounce-worksheet/example-world,#'bounce-worksheet/example-world-final-state]"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[[#'bounce-worksheet/example-world,#'bounce-worksheet/example-world-final-state],0]"}
;; <=

;; @@
(with-primitive-procedures
  [create-world simulate-world balls-in-box]
  (defquery physics0 []
    (let [n-bumpers 8
          f (fn [] (list 
                     (sample (uniform-continuous -5 14))
                     (sample (uniform-continuous 0 10))))
          bs (repeatedly n-bumpers f)
          w0 (create-world bs)
          w1 (simulate-world w0)
          num-balls (balls-in-box w1)]
      (list num-balls bs))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/physics0</span>","value":"#'bounce-worksheet/physics0"}
;; <=

;; @@
(def lazy-samples0 
  (doquery :importance physics0 []))
(def samples0 
  (map :result (take-nth 10 (take 2000 (drop 1000 lazy-samples0))))) 
(def best-sample0 
  (reduce (fn [acc x] (if (> (first x) (first acc)) x acc)) 
          samples0))
best-sample0
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/lazy-samples0</span>","value":"#'bounce-worksheet/lazy-samples0"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/samples0</span>","value":"#'bounce-worksheet/samples0"}],"value":"[#'bounce-worksheet/lazy-samples0,#'bounce-worksheet/samples0]"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/best-sample0</span>","value":"#'bounce-worksheet/best-sample0"}],"value":"[[#'bounce-worksheet/lazy-samples0,#'bounce-worksheet/samples0],#'bounce-worksheet/best-sample0]"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>5.039659490241706</span>","value":"5.039659490241706"},{"type":"html","content":"<span class='clj-double'>2.4748229831103163</span>","value":"2.4748229831103163"}],"value":"(5.039659490241706 2.4748229831103163)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>1.6105279484809571</span>","value":"1.6105279484809571"},{"type":"html","content":"<span class='clj-double'>6.095328821668973</span>","value":"6.095328821668973"}],"value":"(1.6105279484809571 6.095328821668973)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-1.7327828746932634</span>","value":"-1.7327828746932634"},{"type":"html","content":"<span class='clj-double'>2.1429922008512325</span>","value":"2.1429922008512325"}],"value":"(-1.7327828746932634 2.1429922008512325)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>11.46787625011067</span>","value":"11.46787625011067"},{"type":"html","content":"<span class='clj-double'>3.6077249028398284</span>","value":"3.6077249028398284"}],"value":"(11.46787625011067 3.6077249028398284)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-1.1506281530451017</span>","value":"-1.1506281530451017"},{"type":"html","content":"<span class='clj-double'>2.1718715228712937</span>","value":"2.1718715228712937"}],"value":"(-1.1506281530451017 2.1718715228712937)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-1.752497599843685</span>","value":"-1.752497599843685"},{"type":"html","content":"<span class='clj-double'>5.686404684681266</span>","value":"5.686404684681266"}],"value":"(-1.752497599843685 5.686404684681266)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>0.3924210062883362</span>","value":"0.3924210062883362"},{"type":"html","content":"<span class='clj-double'>4.924024324154887</span>","value":"4.924024324154887"}],"value":"(0.3924210062883362 4.924024324154887)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>13.669929061656298</span>","value":"13.669929061656298"},{"type":"html","content":"<span class='clj-double'>3.9039578861003066</span>","value":"3.9039578861003066"}],"value":"(13.669929061656298 3.9039578861003066)"}],"value":"((5.039659490241706 2.4748229831103163) (1.6105279484809571 6.095328821668973) (-1.7327828746932634 2.1429922008512325) (11.46787625011067 3.6077249028398284) (-1.1506281530451017 2.1718715228712937) (-1.752497599843685 5.686404684681266) (0.3924210062883362 4.924024324154887) (13.669929061656298 3.9039578861003066))"}],"value":"(2 ((5.039659490241706 2.4748229831103163) (1.6105279484809571 6.095328821668973) (-1.7327828746932634 2.1429922008512325) (11.46787625011067 3.6077249028398284) (-1.1506281530451017 2.1718715228712937) (-1.752497599843685 5.686404684681266) (0.3924210062883362 4.924024324154887) (13.669929061656298 3.9039578861003066)))"}],"value":"[[[#'bounce-worksheet/lazy-samples0,#'bounce-worksheet/samples0],#'bounce-worksheet/best-sample0],(2 ((5.039659490241706 2.4748229831103163) (1.6105279484809571 6.095328821668973) (-1.7327828746932634 2.1429922008512325) (11.46787625011067 3.6077249028398284) (-1.1506281530451017 2.1718715228712937) (-1.752497599843685 5.686404684681266) (0.3924210062883362 4.924024324154887) (13.669929061656298 3.9039578861003066)))]"}
;; <=

;; @@
(show-world-simulation (first (rest best-sample0)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[quil.Applet 0x3e1738b4 &quot;quil.Applet[panel70,0,0,600x500,layout=java.awt.FlowLayout]&quot;]</span>","value":"#object[quil.Applet 0x3e1738b4 \"quil.Applet[panel70,0,0,600x500,layout=java.awt.FlowLayout]\"]"}
;; <=

;; @@
(with-primitive-procedures
  [create-world simulate-world balls-in-box]
  (defquery physics1 []
    (let [n-bumpers 8
          f (fn [] (list 
                     (sample (uniform-continuous -5 14))
                     (sample (uniform-continuous 0 10))))
          bs (repeatedly n-bumpers f)
          w0 (create-world bs)
          w1 (simulate-world w0)
          num-balls (balls-in-box w1)]
      (observe (normal num-balls 1) 20)
      (list num-balls bs))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/physics1</span>","value":"#'bounce-worksheet/physics1"}
;; <=

;; @@
(def lazy-samples1 
  (doquery :lmh physics1 []))
(def samples1 
  (map :result (take-nth 10 (take 2000 (drop 1000 lazy-samples1)))))
(def best-sample1 
  (reduce (fn [acc x] (if (> (first x) (first acc)) x acc))
          samples1))
best-sample1
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/lazy-samples1</span>","value":"#'bounce-worksheet/lazy-samples1"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/samples1</span>","value":"#'bounce-worksheet/samples1"}],"value":"[#'bounce-worksheet/lazy-samples1,#'bounce-worksheet/samples1]"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/best-sample1</span>","value":"#'bounce-worksheet/best-sample1"}],"value":"[[#'bounce-worksheet/lazy-samples1,#'bounce-worksheet/samples1],#'bounce-worksheet/best-sample1]"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>18</span>","value":"18"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>0.42846830943289227</span>","value":"0.42846830943289227"},{"type":"html","content":"<span class='clj-double'>4.955430158101355</span>","value":"4.955430158101355"}],"value":"(0.42846830943289227 4.955430158101355)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>0.11399011311342733</span>","value":"0.11399011311342733"},{"type":"html","content":"<span class='clj-double'>7.047454084589595</span>","value":"7.047454084589595"}],"value":"(0.11399011311342733 7.047454084589595)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-1.6760284246021682</span>","value":"-1.6760284246021682"},{"type":"html","content":"<span class='clj-double'>3.482088149196809</span>","value":"3.482088149196809"}],"value":"(-1.6760284246021682 3.482088149196809)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>2.5215232534350247</span>","value":"2.5215232534350247"},{"type":"html","content":"<span class='clj-double'>2.5347454541889936</span>","value":"2.5347454541889936"}],"value":"(2.5215232534350247 2.5347454541889936)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>12.119916165254827</span>","value":"12.119916165254827"},{"type":"html","content":"<span class='clj-double'>7.446364186029621</span>","value":"7.446364186029621"}],"value":"(12.119916165254827 7.446364186029621)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>9.842132376151833</span>","value":"9.842132376151833"},{"type":"html","content":"<span class='clj-double'>0.6555153748336084</span>","value":"0.6555153748336084"}],"value":"(9.842132376151833 0.6555153748336084)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>0.383232923290564</span>","value":"0.383232923290564"},{"type":"html","content":"<span class='clj-double'>0.8118697300596889</span>","value":"0.8118697300596889"}],"value":"(0.383232923290564 0.8118697300596889)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>5.731228040496732</span>","value":"5.731228040496732"},{"type":"html","content":"<span class='clj-double'>5.245105763879869</span>","value":"5.245105763879869"}],"value":"(5.731228040496732 5.245105763879869)"}],"value":"((0.42846830943289227 4.955430158101355) (0.11399011311342733 7.047454084589595) (-1.6760284246021682 3.482088149196809) (2.5215232534350247 2.5347454541889936) (12.119916165254827 7.446364186029621) (9.842132376151833 0.6555153748336084) (0.383232923290564 0.8118697300596889) (5.731228040496732 5.245105763879869))"}],"value":"(18 ((0.42846830943289227 4.955430158101355) (0.11399011311342733 7.047454084589595) (-1.6760284246021682 3.482088149196809) (2.5215232534350247 2.5347454541889936) (12.119916165254827 7.446364186029621) (9.842132376151833 0.6555153748336084) (0.383232923290564 0.8118697300596889) (5.731228040496732 5.245105763879869)))"}],"value":"[[[#'bounce-worksheet/lazy-samples1,#'bounce-worksheet/samples1],#'bounce-worksheet/best-sample1],(18 ((0.42846830943289227 4.955430158101355) (0.11399011311342733 7.047454084589595) (-1.6760284246021682 3.482088149196809) (2.5215232534350247 2.5347454541889936) (12.119916165254827 7.446364186029621) (9.842132376151833 0.6555153748336084) (0.383232923290564 0.8118697300596889) (5.731228040496732 5.245105763879869)))]"}
;; <=

;; @@
(show-world-simulation (first (rest best-sample1)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[quil.Applet 0x209edc59 &quot;quil.Applet[panel71,0,0,600x500,layout=java.awt.FlowLayout]&quot;]</span>","value":"#object[quil.Applet 0x209edc59 \"quil.Applet[panel71,0,0,600x500,layout=java.awt.FlowLayout]\"]"}
;; <=

;; @@
(with-primitive-procedures
  [create-world simulate-world balls-in-box]
  (defquery physics2 []
    (let [n-bumpers (sample (poisson 6))
          f (fn [] (list 
                     (sample (uniform-continuous -5 14))
                     (sample (uniform-continuous 0 10))))
          bs (repeatedly n-bumpers f)
          w0 (create-world bs)
          w1 (simulate-world w0)
          num-balls (balls-in-box w1)]
      (observe (normal n-bumpers 2) 0)
      (observe (normal num-balls 1) 20)
      (list num-balls bs))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/physics2</span>","value":"#'bounce-worksheet/physics2"}
;; <=

;; @@
(def lazy-samples2 
  (doquery :lmh physics2 []))
(def samples2 
  (map :result (take-nth 10 (take 2000 (drop 1000 lazy-samples2)))))
(defn is-better [x y]
  (let [num-bumpers-less (< (count (second x)) (count (second y)))
        num-balls-more (> (first x) (first y))
        num-balls-equal (= (first x) (first y))
        x-above-threshold (> (first x) 15)
        y-above-threshold (> (first x) 15)]
    (or (and x-above-threshold num-bumpers-less)
        (and num-balls-equal num-bumpers-less)
        num-balls-more)))
(def best-sample2 
  (reduce (fn [acc x] (if (is-better x acc) x acc)) 
          samples2))
best-sample2
;; @@
;; =>
;;; {"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"list-like","open":"","close":"","separator":"</pre><pre>","items":[{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/lazy-samples2</span>","value":"#'bounce-worksheet/lazy-samples2"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/samples2</span>","value":"#'bounce-worksheet/samples2"}],"value":"[#'bounce-worksheet/lazy-samples2,#'bounce-worksheet/samples2]"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/is-better</span>","value":"#'bounce-worksheet/is-better"}],"value":"[[#'bounce-worksheet/lazy-samples2,#'bounce-worksheet/samples2],#'bounce-worksheet/is-better]"},{"type":"html","content":"<span class='clj-var'>#&#x27;bounce-worksheet/best-sample2</span>","value":"#'bounce-worksheet/best-sample2"}],"value":"[[[#'bounce-worksheet/lazy-samples2,#'bounce-worksheet/samples2],#'bounce-worksheet/is-better],#'bounce-worksheet/best-sample2]"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>18</span>","value":"18"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>3.3372725819978006</span>","value":"3.3372725819978006"},{"type":"html","content":"<span class='clj-double'>8.47981623123972</span>","value":"8.47981623123972"}],"value":"(3.3372725819978006 8.47981623123972)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>6.810994664276837</span>","value":"6.810994664276837"},{"type":"html","content":"<span class='clj-double'>1.2074164603701054</span>","value":"1.2074164603701054"}],"value":"(6.810994664276837 1.2074164603701054)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>11.516669110855627</span>","value":"11.516669110855627"},{"type":"html","content":"<span class='clj-double'>2.9146326254312993</span>","value":"2.9146326254312993"}],"value":"(11.516669110855627 2.9146326254312993)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-3.905786355145122</span>","value":"-3.905786355145122"},{"type":"html","content":"<span class='clj-double'>6.597352342859228</span>","value":"6.597352342859228"}],"value":"(-3.905786355145122 6.597352342859228)"},{"type":"list-like","open":"<span class='clj-list'>(</span>","close":"<span class='clj-list'>)</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>0.5808260753916357</span>","value":"0.5808260753916357"},{"type":"html","content":"<span class='clj-double'>0.6871272205893586</span>","value":"0.6871272205893586"}],"value":"(0.5808260753916357 0.6871272205893586)"}],"value":"((3.3372725819978006 8.47981623123972) (6.810994664276837 1.2074164603701054) (11.516669110855627 2.9146326254312993) (-3.905786355145122 6.597352342859228) (0.5808260753916357 0.6871272205893586))"}],"value":"(18 ((3.3372725819978006 8.47981623123972) (6.810994664276837 1.2074164603701054) (11.516669110855627 2.9146326254312993) (-3.905786355145122 6.597352342859228) (0.5808260753916357 0.6871272205893586)))"}],"value":"[[[[#'bounce-worksheet/lazy-samples2,#'bounce-worksheet/samples2],#'bounce-worksheet/is-better],#'bounce-worksheet/best-sample2],(18 ((3.3372725819978006 8.47981623123972) (6.810994664276837 1.2074164603701054) (11.516669110855627 2.9146326254312993) (-3.905786355145122 6.597352342859228) (0.5808260753916357 0.6871272205893586)))]"}
;; <=

;; @@
(show-world-simulation (first (rest best-sample2)))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-unkown'>#object[quil.Applet 0x5b4d40cd &quot;quil.Applet[panel72,0,0,600x500,layout=java.awt.FlowLayout]&quot;]</span>","value":"#object[quil.Applet 0x5b4d40cd \"quil.Applet[panel72,0,0,600x500,layout=java.awt.FlowLayout]\"]"}
;; <=

;; @@

;; @@
