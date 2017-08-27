# CS492 Probabilistic Programming, Fall 2017, KAIST 

This is a website for the course "CS492 Probabilistic Programming", which is offered 
at the KAIST CS department in the fall of 2017. The website will contain lecture slides
and other course-related materials.

Probabilistic programming refers to the idea of developing a programming 
language for writing and reasoning about probabilistic models from machine learning 
and statistics. Such a language comes with the implementation of several generic
inference algorithms that answer various queries about the models written 
in the language, such as posterior inference and marginalisation. By providing these
algorithms, a probabilistic programming language
enables data scientists to focus on designing good models based on their domain knowledge,
instead of building effective inference engines for their models, a task that 
typically requires expertise
in machine learning, statistics and systems. Even experts in machine learning
and statistics may get benefitted from such a probabilistic programming system
because using the system they can easily explore highly advanced models.

This course has two goals. The first is to help students to be a good user
of an expressive probabilistic programming language. 
Throughout the course, we will use a particular 
language, called [Anglican](http://www.robots.ox.ac.uk/~fwood/anglican/),
but we will emphasise general principles that apply to a wide range of existing probabilistic
programming systems. The second goal is to expose the students to recent exciting results
in probabilistic programming, which come from machine learning, statistics, 
programming languages, and probability theory. 
Through a group project, students will be given a chance to study such a result
and to play with it.

## 1. Announcements

#### [August 27 2017] 1. Missing lectures and interview sessions.

There will be no lectures on the following dates:
1. September 4 (Mon) and September 6 (Wed) - Business Trip
2. October 4 (Wed) - Chuseok
3. October 9 (Mon) - Hangul Proclamation Day
4. October 16 (Mon) and October 18 (Wed) - Midterm Exam Period
5. November 13 (Mon) and November 15 (Wed) - Business Trip
6. December 11 (Mon) and December 13 (Wed) - Final Exam Period

Instead of the four missing lectures, I plan to schedule three four-hour
interview sessions with project groups. Here is our current plan:
1. 7:00pm - 9:00pm on September 21 and 22 (Thu and Fri).
2. 7:00pm - 9:00pm on October 26 and 27 (Thu and Fri).
3. 7:00pm - 9:00pm on November 09 and 10 (Thu and Fri).

## 2. Logistics

#### Evaluation

Final exam (40%). Project (40%). Homework (20%).

#### Teaching Staffs

* Lecturer: [Hongseok Yang](https://cs.kaist.ac.kr/people/view?idx=552&kind=faculty&menu=160) (email: hongseok.yang@kaist.ac.kr)
* TA: Byungsu Kim (email: bskim90@kaist.ac.kr)

#### Place and Time

* Place: Room 2443 in the E3 Building
* Time: 9:00 - 10:15 on Monday and Wednesday from August 28 2017 until December 15 2017. 

Look at the announcements for the cancelled lectures and the additional meetings.

## 3. Tentative Plan

* 08/28 (Mon) - Introduction. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture1/Lecture1.pdf)
* 08/30 (Wed) - Basics of Clojure and Tiny Bit of Anglican. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture2/Lecture2.pdf)
* 09/04 (Mon) - **NO LECTURE** 
* 09/06 (Wed) - **NO LECTURE**
* 09/11 (Mon) - Posterior Inference and Basics of Anglican. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture3/Lecture3.pdf)
* 09/13 (Wed) - Generative Models. (Tentative)
* 09/18 (Mon) - Markov Chain Monte Carlo (MCMC). (Tentative)
* 09/20 (Wed) - CPS Transformation and Implementation of MCMC for Probabilsitic Programs. (Tenative)
* __**09/21 (Thu)**__ - Interview with project groups
* __**09/22 (Fri)**__ - Interview with project groups
* 09/25 (Mon) - CPS Transformation and Implementation of MCMC for Probabilsitic Programs. (Tenative)
* 09/27 (Wed) - Advanced Inference Algorithms.
* 10/02 (Mon) - Advanced Inference Algorithms.
* 10/04 (Wed) - **NO LECTURE**
* 10/09 (Mon) - **NO LECTURE**
* 10/11 (Wed) - TBD
* 10/16 (Mon) - **NO LECTURE**
* 10/18 (Wed) - **NO LECTURE**
* 10/23 (Mon) - TBD
* 10/25 (Wed) - TBD
* __**10/26 (Thu)**__ - Interview with project groups
* __**10/27 (Fri)**__ - Interview with project groups
* 10/30 (Mon) - TBD
* 11/01 (Wed) - TBD
* 11/06 (Mon) - TBD
* 11/08 (Wed) - TBD
* __**11/09 (Thu)**__ - Interview with project groups
* __**11/10 (Fri)**__ - Interview with project groups
* 11/13 (Mon) - **NO LECTURE**
* 11/15 (Wed) - **NO LECTURE**
* 11/20 (Mon) - 
* 11/22 (wed) - Group Presentation and Follow-up Discussion
* 11/27 (Mon) - Group Presentation and Follow-up Discussion
* 11/29 (Wed) - Group Presentation and Follow-up Discussion
* 12/04 (Mon) - Group Presentation and Follow-up Discussion
* 12/06 (Wed) - Group Presentation and Follow-up Discussion
* 12/11 (Mon) - **NO LECTURE**
* 12/13 (Wed) - **NO LECTURE**

Introduction
Basics of Clojure and Tiny Bit of Anglican
Posterior Inference and Basics of Anglican
Generative Models
Markov Chain Monte Carlo (MCMC)
CPS Transformation and Implementation of MCMC for Probabilistic Programs
Sequential Monte Carlo 
Basic Measure Theory
Quasi-Borel Space and Semantics of Probabilistic Programs
Amortised Inference
Automated Differentiation, Hamiltonian Monte Carlo
Conclusion

## Studying Materials

Unfortunately we do not know of a good textbook that matches the topics of this course exactly.Studying the lecture slides and the homework exercises of the course is likely to be the most time-efficient way to catch up with this course. Additionally, we suggest the following list of online materials.

1. [Anglican website](http://www.robots.ox.ac.uk/~fwood/anglican/). In particular, students will learn a lot by trying examples in the site.

2. Goodman and Stuhlmuller's book "[The Design and Implementation of Probabilistic Programming Languages](http://dippl.org/)" This web-based book describes the implementation of WebPPL, a probabilistic programming language on top of JavaScript. Many techniques in the book are general and apply to other probabilistic programming languages.

3. [Forestdb.org](http://forestdb.org/) is a great source of interesting probabilistic programs. 

4. The online book "[Probabilistic Programming and Bayesian Methods for Hackers](https://github.com/CamDavidsonPilon/Probabilistic-Programming-and-Bayesian-Methods-for-Hackers)" describes Bayesian Machine Learning using a probabilistic programming system called PyMC.  Hongseok found this book easy to follow and good at explaining basics and intuitions. A more standard reference on machine learning is Bishop's book "Pattern Recognition and Machine Learning".

## Group Activities

2-3 people form a group and have to do two main tasks. The first is to select a recent paper on probabilistic programming or a related topic, and to give a 30-min presentation on the selected paper. The second is to carry out a project on building a cool application of probabilistic programming, or on extending existing results slightly. This extension neither has to be grand nor has to produce better algorithms in terms of performance than existing ones, as long as it is analyzed and carried out thoughtfully. In an ideal world, both activities are related; a group reads a paper, presents it, and works on extending the results in the paper. This ideal is, however, just a recommendation, not a requirement.

Track A:
Track B:

* Automated differentiation 
* Automatic model criticism and revision
* Program induction
* Amortised inference
* Semantic challenges
* Black-box Variational Inference
* Interesting applciations of probabilistic programs
* Challeging models 

Papers on applications.

* Reasoning about reasoning by nested conditioning: Modeling theory of mind with probabilistic programs. Stuhlmuller, A., & Goodman, N. D. (2014). Cognitive Systems Research. [PDF](http://ac.els-cdn.com/S1389041713000387/1-s2.0-S1389041713000387-main.pdf?_tid=ccc56dc0-8ad0-11e7-b2eb-00000aacb35e&acdnat=1503801685_7dbb093f8f7c45aa3334424c07f5349d)

* Human-level Concept Learning Through Probabilistic Program Induction. Lake, B. M., Salakhutdinov, R., & Tenenbaum, J. B. (2015). Science. [PDF](http://science.sciencemag.org/content/sci/350/6266/1332.full.pdf)

* Picture: A Probabilistic Programming Language for Scene Perception. Kulkarni, T., Kohli, P., Tenenbaum, J., & Mansinghka, V. (2015). In Proceedings of CVPR 2015. [PDF](https://mrkulk.github.io/www_cvpr15/1999.pdf)

* A Probabilistic Programming Approach To Probabilistic Data Analysis. 
Saad, F., & Mansinghka, V. (2016). In Proceedings of NIPS 2016. [PDF](https://papers.nips.cc/paper/6060-a-probabilistic-programming-approach-to-probabilistic-data-analysis.pdf)

* Detecting Dependencies in Sparse, Multivariate Databases Using Probabilistic Programming and Non-parametric Bayes. Saad, F., & Mansinghka, V. (2017). In Proceedings of AISTATS 2017. [PDF](http://proceedings.mlr.press/v54/saad17a/saad17a.pdf).

Papers on inference algorithms.

* Inference Compilation and Universal Probabilistic Programming. 
Le, T. A., Baydin, A. G., & Wood, F. (2017). In Proceedings of AISTATS 2017.
[PDF](https://arxiv.org/pdf/1610.09900.pdf).

* Bayesian Optimization for Probabilistic Programs. 
Rainforth, T., Le, T. A., van de Meent, J.-W., Osborne, M. A., & Wood, F. (2016). 
In Proceedings of NIPS 2016. [PDF for short version](http://www.robots.ox.ac.uk/~fwood/assets/pdf/rainforth-nips-2016.pdf). [PDF for long version](http://www.robots.ox.ac.uk/~twgr/assets/pdf/rainforth2016BOPP.pdf).

* Design and Implementation of Probabilistic Programming Language Anglican. 
Tolpin, D., van de Meent, J.-W., Yang, H., & Wood, F. (2016). 
In Proceedings of IFL 2016. [PDF](https://arxiv.org/pdf/1608.05263.pdf).

Papers on semantics.

* Semantics for Probabilistic Programming: Higher-order Functions, Continuous Distributions, and Soft Constraints. Staton, S., Yang, H., Heunen, C., Kammar, O., & Wood, F. (2016). 
In Proceedings of LICS 2016. [PDF](https://arxiv.org/pdf/1601.04943.pdf).

* Commutative Semantics for Probabilistic Programming.  Staton, S. (2017). In Proceedings of ESOP 2017. [PDF](http://www.cs.ox.ac.uk/people/samuel.staton/papers/esop2017.pdf).

* A Convenient Category for Higher-Order Probability Theory. Heunen, C., Kammar O., Staton, S., & Yang, H. (2017). In Proceedings of LICS 2017. [PDF](https://arxiv.org/pdf/1701.02547.pdf).



